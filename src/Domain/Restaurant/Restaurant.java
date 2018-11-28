package Domain.Restaurant;

import Business.ContactInfo;
import Business.Position;

public class Restaurant {
    private String name;
    private ContactInfo contactInfo;

    public Position getPosition(){
        return contactInfo.getAddress().getPosition();
    }
}
