package Restaurant;

import Common.Position;
import Payment.Money;

public class Dish {
    private String name;
    private String description;
    private Money price;
    private int productionTime;
    private int maximumDeliveryTime;
    private Allergeen[] allergeens;

    private Restaurant restaurant;


    public Position getPosition(){
        return restaurant.getPosition();
    }
}
