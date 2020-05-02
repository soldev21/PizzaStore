package az.edutech.pizzastore.model;

import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Cheque {

    private Integer id;
    private List<Order> orders;

    public Cheque(Integer id) {
        // Initialize orders list.
        // Initialize id.
        this.id = id;
        orders = new ArrayList();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }


    public void removeOrder(Order order) {
        orders.remove(order);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id: ").append(id).append("\n-----------------\n")
                .append(String.format("%-15s %-5s %-2s %-6s\n", "Name", "Price", "Count", "Total"));
        for (Order order : orders) {
            builder.append(String.format("%-15s %-5.2f %2d %6.2f\n", order.getItemName(), order.getItemPrice(), order.getItemCount(), order.getTotalPrice()));
        }
        builder.append("-------END--------\n");
        return builder.toString();
    }


    @Getter
    public static class Order {

        private String itemName;
        private Float itemPrice;
        private Integer itemCount;
        private Float totalPrice;

        public Order(String itemName, Float itemPrice, Integer itemCount, Float totalPrice) {
            this.itemCount = itemCount;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.totalPrice = totalPrice;
        }

    }
}
