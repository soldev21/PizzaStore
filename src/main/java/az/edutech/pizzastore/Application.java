package az.edutech.pizzastore;

import az.edutech.pizzastore.model.AbstractPizza;
import az.edutech.pizzastore.model.Cheque;
import az.edutech.pizzastore.store.PizzaStore;

public class Application {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore("Kapital Pizza Store");
//        String cheque = pizzaStore.orderPizza("Margarita",3);
        pizzaStore.openNewCheque();
        pizzaStore.orderPizza("Margarita",3);
        pizzaStore.orderPizza("BBQ",6);
        pizzaStore.orderPizza("SomePizza",2);
        Cheque cheque = pizzaStore.closeCheque();

        System.out.println(pizzaStore.getAllOrderHistory());

        pizzaStore.removeOrder(cheque,2);

        System.out.println(pizzaStore.getAllOrderHistory());

//        pizzaStore.openNewCheque();
//        pizzaStore.orderPizza("Margarita",6);
//        Cheque cheque1 = pizzaStore.closeCheque();
//
//        pizzaStore.cancelCheque(cheque);
////        System.out.println(pizzaStore.getAllOrderHistory());
//        System.out.println(pizzaStore.getAllCancelledOrderHistory());
    }
}
