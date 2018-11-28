package Domain.Order;

import Business.Position;
import Domain.Restaurant.Dish;

public class OrderLine {
    private int quantity;
    private String remark;

    private Dish dish;

    public Position getPosition(){
        return dish.getPosition();
    }

    public Dish getDish() {
        return dish;
    }
}
