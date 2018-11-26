package Order;

import Common.Address;
import Common.Position;

import java.util.List;

public class Order implements Comparable<Order>{
    private Address deliveryAdress;
    private String deliveryInstructions;

    private int orderId;
    private List<OrderLine> orderLines;

    public Position getRestaurantPosition(){
        OrderLine firstOrderLine = orderLines.get(0);
        return firstOrderLine.getDish().getPosition();
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public int compareTo(Order o2) {
        return this.getOrderId()-o2.getOrderId();
    }
}
