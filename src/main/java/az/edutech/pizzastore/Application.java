package az.edutech.pizzastore;

import az.edutech.pizzastore.model.Cheque;
import az.edutech.pizzastore.store.PizzaStore;

public class Application {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore("My Pizza Store.");
        pizzaStore.orderPizza("SomePizza",5);
    }
}
