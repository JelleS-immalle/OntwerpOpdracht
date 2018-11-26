package Common;

public class Address {
    private City city;
    private String straat;
    private String nummer;
    private Position position;

    public Position getPosition(){
        return this.position;
    }
}
