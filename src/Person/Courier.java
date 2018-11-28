package Person;

import Common.Position;
import DistanceAPI.DistanceCalculator;
import Order.Order;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Courier extends Person{
    private boolean isAvailable;
    private Position currentPosition;

    private List<Order> orders;
    private List<Order> relevanteOrders;
    private int courierPoints;

    public List<Order> geefBeschikbareLeveringen(){
        DistanceCalculator dc = new DistanceCalculator();

        for(Order o : orders){
            Position restaurantPosition = o.getRestaurantPosition();

            // Afstand kleiner dan 5km?
            if(dc.getDistance(currentPosition, restaurantPosition) < 5000){
                LocalDateTime bestelTijd = o.getBestelTijd();

                Duration tempDuration = Duration.between(
                        bestelTijd,
                        LocalDateTime.now());

                // Order minder dan 5 minuten geleden geplaatst?
                if(tempDuration.toMinutes() < 5){
                    int orderAveragePoints = o.getAverageDeliveryPoints();
                    // Heeft de courier meer punten dan het gemiddelde uit het order
                    if(orderAveragePoints < courierPoints){
                        relevanteOrders.add(o);
                    }
                }
                // Order meer dan 5 minuten geleden geplaatst?
                else{
                    relevanteOrders.add(o);
                }
            }
        }

        return getOudsteOrders(relevanteOrders);
    }

    private List<Order> getOudsteOrders(List<Order> lijst){
        lijst.sort(Comparator.naturalOrder());

        List<Order> teReturnenOrders = new ArrayList<Order>();
        for(int i = 0; i < 3; i++){
            teReturnenOrders.add(lijst.get(i));
        }

        return teReturnenOrders;
    }
}
