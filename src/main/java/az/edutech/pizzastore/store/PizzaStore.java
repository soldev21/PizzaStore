package az.edutech.pizzastore.store;

import az.edutech.pizzastore.model.Cheque;

import java.util.List;

public class PizzaStore {

    // gettet ve setter metodlar elave edin.
    private String name;
    private List<Cheque> cheques;

    public PizzaStore(String name){
        this.name = name;
        // Init cheques list
    }

    /*
    * Bu method sifarish vermek istediyiniz pizzanin adini ve sayini
    * sizden teleb edir. Ve neticesinde size bir cek qaytarir
    * hansi ki, orada sifarish etdiyiniz pizzanin adi sayi ve yekun mebleg eks olunur.
    * Bu metodun istifadesinde PizzaFactory-nin getPriceForPizza metodundan istifade edeceksiniz.
    * Mes: Name: Margarita, Count: 2, Price: 10.
    * */
    public String orderPizza(String pizzaName, Integer count){
        // Bu methodu implement etmelisiniz.
        return null;
    }

    public boolean cancelOrder (Cheque cheque){
        // cancel order if possible
        return false;
    }

    public Cheque removeOrder(Cheque cheque, Integer orderNo){
        // return New Cheque
        return null;
    }

    /*
    Bu method butun pizza sifarish ceklerini qaytarmalidir.
    Bunun ucun butun cekleri yadda saxlamalisiniz.
    * */
    public String getAllOrderHistory(){
        return "";
    }
}
