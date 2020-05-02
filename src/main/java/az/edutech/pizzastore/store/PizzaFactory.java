package az.edutech.pizzastore.store;

import az.edutech.pizzastore.model.AbstractPizza;
import az.edutech.pizzastore.model.BBQ;
import az.edutech.pizzastore.model.Margarita;
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

    public static AbstractPizza getPizzaByName(String pizzaName){
        if (pizzaName.equals("SomePizza")) {
            return new SomePizza();
        }else if (pizzaName.equals("Margarita")){
            return new Margarita();
        }else if (pizzaName.equals("BBQ")){
            return new BBQ();
        }

        throw new RuntimeException("There is no such pizza ".concat(pizzaName));
    }

    public static void main(String[] args) {
        float price = PizzaFactory.getPizzaByName("BBQ").getPrice();
        System.out.println(price);
    }
}
