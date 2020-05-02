package az.edutech.pizzastore.model;

import lombok.Data;

@Data
public abstract class AbstractPizza {

    private final String name;
    private final float price;

    public AbstractPizza(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /* Bu method count sayda pizza ucun qiymet qaytarir.
       Ola biler ki, muxtelif saylarda muxtelif endirimler heyata kecirilsin
     */
    public float getPriceForCount(int count) {
        // Bu metodu implemet etemelisiniz.
        return price * count;
    }
}
