package Order;

import java.time.LocalDateTime;

public class OrderStateEvent {
    // moet een datetime zijn
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
