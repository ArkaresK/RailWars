package RailWars.java;

public class Travel {
    public String LeavingFrom;
    public String GoingTo;
    public float price;
    public float distance;
    public String timeTravel;
    public String transport;

    public Travel(String LeavingFrom, String GoingTo, float price, float distance, String timeTravel, String transport){
        this.LeavingFrom = LeavingFrom;
        this.GoingTo = GoingTo;
        this.price = price;
        this.distance = distance;
        this.timeTravel = timeTravel;
        this.transport = transport;
    }

    public float getPrice() {
        return price;
    }

}
