package az.edutech.pizzastore;

import az.edutech.pizzastore.store.PizzaStore;

public class Application {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore("Kapital Pizza Store");
//        String cheque = pizzaStore.orderPizza("Margarita",3);
        pizzaStore.openNewCheque();
        pizzaStore.orderPizza("Margarita",3);
        pizzaStore.orderPizza("BBQ",6);
        pizzaStore.orderPizza("SomePizza",2);
        pizzaStore.closeCheque();

        pizzaStore.openNewCheque();
        pizzaStore.orderPizza("Margarita",6);
        pizzaStore.closeCheque();
        System.out.println(pizzaStore.getAllOrderHistory());
    }
}
