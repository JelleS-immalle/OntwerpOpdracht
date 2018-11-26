package Restaurant;

import Common.ContactInfo;
import Common.Position;

public class Restaurant {
    private String name;
    private ContactInfo contactInfo;

    public Position getPosition(){
        return contactInfo.getAddress().getPosition();
    }
}
