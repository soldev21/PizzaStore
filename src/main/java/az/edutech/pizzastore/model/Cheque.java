package az.edutech.pizzastore.model;

import com.sun.org.apache.xpath.internal.operations.Or;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cheque {

    private Integer id;
    private boolean cancelled;
    private List<Order> orders;

    public Cheque(Integer id) {
        // Initialize orders list.
        // Initialize id.
        setId(id);
        setCancelled(false);
        orders = new ArrayList();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }


    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void removeOrder(Integer orderNo) {
        if (orderNo<1 || orderNo>orders.size()) throw new RuntimeException("There is no such an order!");
        orders.remove(orderNo-1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Id: ").append(id);
        if (isCancelled()) builder.append(" CANCELLED\n");
        builder.append("\n-----------------\n")
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
