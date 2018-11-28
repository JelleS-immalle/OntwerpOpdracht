package Domain.Order;

import java.time.LocalDateTime;

public class OrderStateEvent {
    private LocalDateTime time;
    private OrderState state;
    private String remark;

    public LocalDateTime getTime() {
        return time;
    }

    public OrderState getState(){
        return state;
    }
}
