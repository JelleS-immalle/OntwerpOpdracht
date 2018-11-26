package Order;

import Common.Position;
import Restaurant.Dish;

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
