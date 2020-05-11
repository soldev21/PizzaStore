package az.edutech.pizzastore.store;

import az.edutech.pizzastore.model.AbstractPizza;
import az.edutech.pizzastore.model.Cheque;
import az.edutech.pizzastore.model.SomePizza;

import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PizzaStore {

    // gettet ve setter metodlar elave edin.
    private String name;
    private List<Cheque> cheques;
    private int chequeCount;
    private Cheque currentCheque;

    public PizzaStore(String name) {
        this.name = name;
        cheques = new ArrayList();
        chequeCount = 1;
        // Init cheques list
    }

    public void openNewCheque() {
        if (Objects.nonNull(currentCheque)) throw new RuntimeException("There is already a customer in queue.");
        currentCheque = new Cheque(chequeCount++);
        cheques.add(currentCheque);
    }

    public Cheque closeCheque() {
        Cheque res = currentCheque;
        currentCheque = null;
        return res;
    }

    /*
     * Bu method sifarish vermek istediyiniz pizzanin adini ve sayini
     * sizden teleb edir. Ve neticesinde size bir cek qaytarir
     * hansi ki, orada sifarish etdiyiniz pizzanin adi sayi ve yekun mebleg eks olunur.
     * Bu metodun istifadesinde PizzaFactory-nin getPriceForPizza metodundan istifade edeceksiniz.
     * Mes: Name: Margarita, Count: 2, Price: 10.
     * */
    public String orderPizza(String pizzaName, Integer count) {
        if (Objects.isNull(currentCheque)) throw new RuntimeException("There is no any open cheque. Please call openNewCheque() method first");

        // Bu methodu implement etmelisiniz.
        AbstractPizza pizza = PizzaFactory.getPizzaByName(pizzaName);

        float price = pizza.getPriceForCount(count);
//        Cheque cheque = new Cheque(chequeCount++);
        currentCheque.addOrder(new Cheque.Order(pizzaName, pizza.getPrice(), count, price));
//        cheques.add(cheque);
//        return currentCheque.toString();
        return "Okey";

    }

    public boolean cancelCheque(Cheque cheque) {
        // cancel order if possible
        if (cheques.contains(cheque)){
            cheque.setCancelled(true);
            return true;
        }else {
            return false;
        }
    }

    public void removeOrder(Cheque cheque, Integer orderNo) {
        // return New Cheque
        if (!cheques.contains(cheque)) throw new RuntimeException("There is no such cheque!");
        cheque.removeOrder(orderNo);
    }

    /*
    Bu method butun pizza sifarish ceklerini qaytarmalidir.
    Bunun ucun butun cekleri yadda saxlamalisiniz.
    * */
    public String getAllOrderHistory() {
        if (Objects.nonNull(currentCheque)) throw new RuntimeException("Please close cheque first.");
        StringBuilder history = new StringBuilder();
        for (Cheque cheque : cheques) {
            if (!cheque.isCancelled()) {
                history.append(cheque.toString())
                        .append("\n");
            }
        }
        return history.toString();
    }

    public String getAllCancelledOrderHistory() {
        if (Objects.nonNull(currentCheque)) throw new RuntimeException("Please close cheque first.");
        StringBuilder history = new StringBuilder();
        for (Cheque cheque : cheques) {
            if (cheque.isCancelled()) {
                history.append(cheque.toString())
                        .append("\n");
            }
        }
        return history.toString();
    }
}
