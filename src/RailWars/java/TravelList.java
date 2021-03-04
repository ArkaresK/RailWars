package RailWars.java;

public class TravelList {
    public Travel[] list;
    public int totalTravel;
    TravelList(){
        list = new Travel[100];
    }
    public void add(Travel a){
        if(totalTravel < list.length){
            list[totalTravel] = a;
            totalTravel ++;
        }
    }
    public String toString(){
        String s="";
        s+=totalTravel+" Travel :\n";
        for (int i =0; i<totalTravel; i++) {
            s+=" - "+list[i].LeavingFrom+" to "+list[i].GoingTo+" for "+list[i].price+"€ in "+list[i].timeTravel+" ("+list[i].distance+" km)\n";
        }
        return s;
    }
    public String compareTo(String LeavingFrom, String GoingTo){
        String s = "Result for research "+ LeavingFrom+" to " +GoingTo+" :\n";
        for (int i =0; i<totalTravel; i++) {
            if(LeavingFrom.equals(list[i].LeavingFrom) && GoingTo.equals(list[i].GoingTo)){
                s += " - "+list[i].LeavingFrom+" to "+list[i].GoingTo+" for "+list[i].price+"€ in "+list[i].timeTravel+" ("+list[i].distance+" km)\n";
            }
        }
        return s;
    }
}
