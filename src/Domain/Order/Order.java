package Domain.Order;

import Business.Address;
import Business.Position;

import java.time.LocalDateTime;
import java.util.List;

public class Order implements Comparable<Order>{
    private Address deliveryAdress;
    private String deliveryInstructions;
    private int averageDeliveryPoints;

    private int orderId;
    private List<OrderLine> orderLines;
    private List<OrderStateEvent> orderStateEvents;

    public Position getRestaurantPosition(){
        OrderLine firstOrderLine = orderLines.get(0);
        return firstOrderLine.getDish().getPosition();
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getBestelTijd(){
        LocalDateTime tempTime = null;

        for(OrderStateEvent orderStateEvents : orderStateEvents){
            if(orderStateEvents.getState() == OrderState.ORDER_PLACED){
                tempTime = orderStateEvents.getTime();
            }
        }
        return tempTime;
    }

    public int getAverageDeliveryPoints() {
        return averageDeliveryPoints;
    }

    @Override
    public int compareTo(Order o2) {
        return this.getOrderId()-o2.getOrderId();
    }
}
