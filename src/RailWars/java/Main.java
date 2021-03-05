package RailWars.java;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        TravelList ListTravel = new TravelList();
        String filePath = "C:\\Users\\Calvin\\IdeaProjects\\Rail Wars\\src\\RailWars\\json\\DataTravel.json";

        FileReader reader = new FileReader(filePath);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        System.out.println(jsonObject+"\n");

        JSONArray array = (JSONArray) jsonObject.get("Travel");
        for (Object o : array) {
            JSONObject Travel = (JSONObject) o;
            String from = (String) Travel.get("from");
            String to = (String) Travel.get("to");
            String time = (String) Travel.get("time");
            Long distance = (Long) Travel.get("distance");
            Long price = (Long) Travel.get("price");
            String transport = (String) Travel.get("transport");
            Travel TravelTemp = new Travel(from, to, price, distance, time, transport);
            ListTravel.add(TravelTemp);
        }
        System.out.println(ListTravel);
        System.out.println(ListTravel.toString());
        System.out.println(ListTravel.compareTo("Paris","London"));
        System.out.println(ListTravel.selectByTransport("bus"));
        System.out.println(ListTravel.compareByTransport("Paris","London","airplane"));
        System.out.println(ListTravel.travelFrom("Paris"));
        System.out.println(ListTravel.contains("Paris"));

    }
}
