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
    /*
    Fonction contains permet de vérifier si une destination est présente au sein de la liste des voyages
     */
    public boolean contains(String destination){
        for (int i = 0; i < totalTravel; i++) {
            if (destination.equals(list[i].LeavingFrom) || destination.equals(list[i].GoingTo)) {
                return true;
            }
        }
        return false;
    }
    /*
    containsDeparture permet de vérifier si une destination de départ est disponible
     */
    public boolean containsDeparture(String LeavingFrom){
        for (int i = 0; i < totalTravel; i++) {
            if (LeavingFrom.equals(list[i].LeavingFrom)){
                return true;
            }
        }
        return false;
    }
    /*
    toString permet l'affichage graphique des inormations de chaque voyages
     */
    public String toString(){
        StringBuilder s= new StringBuilder();
        s.append(totalTravel > 2 ? totalTravel + " Travels :\n" : totalTravel + " Travel :\n");
        for (int i =0; i<totalTravel; i++) {
            s.append(" - ").append(list[i].LeavingFrom).append(" to ").append(list[i].GoingTo).append(" for ")
                    .append(list[i].price).append("€ in ").append(list[i].timeTravel).append(" (").append(list[i].distance)
                    .append(" km) by ").append(list[i].transport).append("\n");
        }
        return s.toString();
    }
    /*
    travelFrom affiche tous les voyages disponibles à partir de la destination passée en paramètre
     */
    public String travelFrom(String LeavingFrom){
        if (containsDeparture(LeavingFrom)) {
            StringBuilder s = new StringBuilder("Result for travel search from " + LeavingFrom + " :\n");
            for (int i =0; i<totalTravel; i++) {
                if(LeavingFrom.equals(list[i].LeavingFrom)){
                    s.append(" - ").append(list[i].LeavingFrom).append(" to ").append(list[i].GoingTo).append(" for ")
                            .append(list[i].price).append("€ in ").append(list[i].timeTravel).append(" (").append(list[i].distance)
                            .append(" km) by ").append(list[i].transport).append("\n");
                }
            }
            return s.toString();
        }
        else {
            return "No result found";
        }
    }
    /*
    compareTo permet de comparer les voyages en fonction du lieu de départ et d'arrivée
     */
    public String compareTo(String LeavingFrom, String GoingTo){
        StringBuilder s = new StringBuilder("Result for research " + LeavingFrom + " to " + GoingTo + " :\n");
        for (int i =0; i<totalTravel; i++) {
            if(LeavingFrom.equals(list[i].LeavingFrom) && GoingTo.equals(list[i].GoingTo)){
                s.append(" - ").append(list[i].LeavingFrom).append(" to ").append(list[i].GoingTo).append(" for ")
                        .append(list[i].price).append("€ in ").append(list[i].timeTravel).append(" (").append(list[i].distance)
                        .append(" km) by ").append(list[i].transport).append("\n");
            }
        }
        return s.toString();
    }
    /*
    selectByTransport permet d'afficher tous les voyages en fonctions du mode de transport
     */
    public String selectByTransport(String transport){
        StringBuilder s = new StringBuilder("Result for research travel by " + transport + " :\n");
        for (int i =0; i<totalTravel; i++) {
            if(transport.equals(list[i].transport)){
                s.append(" - ").append(list[i].LeavingFrom).append(" to ").append(list[i].GoingTo).append(" for ")
                        .append(list[i].price).append("€ in ").append(list[i].timeTravel).append(" (").append(list[i].distance)
                        .append(" km) by ").append(list[i].transport).append("\n");
            }
        }
        return s.toString();
    }
    /*
    compareByTransport a la même vocation que compareTo en ajoutant le paramètre du moyen de transport
     */
    public String compareByTransport(String LeavingFrom, String GoingTo, String transport){
        StringBuilder s = new StringBuilder("Result for research " + LeavingFrom + " to " + GoingTo + " by " + transport + " :\n");
        for (int i =0; i<totalTravel; i++) {
            if(LeavingFrom.equals(list[i].LeavingFrom) && GoingTo.equals(list[i].GoingTo) && transport.equals(list[i].transport)){
                s.append(" - ").append(list[i].LeavingFrom).append(" to ").append(list[i].GoingTo).append(" for ")
                        .append(list[i].price).append("€ in ").append(list[i].timeTravel).append(" (").append(list[i].distance)
                        .append(" km) by ").append(list[i].transport).append("\n");
            }
        }
        return s.toString();
    }
}
