package az.edutech.pizzastore.model;

import java.util.List;

public class Cheque {

    private Integer id;
    private List<Order> orders;

    public Cheque(){
        // Initialize orders list.
        // Initialize id.
    }

    public void addOrder(Order order){

    }


    public void removeOrder(Order order){

    }

    @Override
    public String toString(){
        return "";
    }

    public static class Order {

        private String itemName;
        private Float itemPrice;
        private Integer itemCount;
        private Float totalPrice;

        // Create some other constructors
        public Order(){

        }

    }
}
