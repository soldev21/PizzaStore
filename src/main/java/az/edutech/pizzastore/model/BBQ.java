package az.edutech.pizzastore.model;

public class BBQ extends AbstractPizza {

    public BBQ() {
        super("BBQ",8.0f);
    }

    @Override
    public float getPriceForCount(int count) {
        return super.getPriceForCount(count)*.8f;
    }
}
