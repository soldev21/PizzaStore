package az.edutech.pizzastore.model;

public class Margarita extends AbstractPizza {

    public Margarita() {
        super("Margarita", 3.0f);
    }

    @Override
    public float getPriceForCount(int count) {
        return super.getPriceForCount(count)*.5f;
    }
}
