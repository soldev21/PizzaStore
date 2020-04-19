package az.edutech.pizzastore.store;

import az.edutech.pizzastore.model.SomePizza;

public class PizzaFactory {

    public static float getPriceForPizza(String pizzaName, int count) {
        if (pizzaName.equals("SomePizza")) {
            return new SomePizza().getPriceForCount(count);
        } else if (pizzaName.equals("SomeOtherPizza")) {
            // ...
            return 0.0f;
        }
        //....


        throw new RuntimeException("There is no such pizza ".concat(pizzaName));
    }
}
