package RailWars.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.*;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException, FileNotFoundException {
        TravelList ListTravel = new TravelList();
        String filePath = "C:\\Users\\Calvin\\IdeaProjects\\Rail Wars\\src\\RailWars\\java\\DataTravel.json";



        FileReader reader = new FileReader(filePath);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        System.out.println(jsonObject+"\n\n\n");

        JSONArray array = (JSONArray) jsonObject.get("Travel");
        for(int i=0;i<array.size();i++){
            JSONObject Travel=(JSONObject) array.get(i);
            String from= (String) Travel.get("from");
            String to = (String) Travel.get("to");
            String time = (String) Travel.get("time");
            Long distance = (Long) Travel.get("distance");
            Long price = (Long) Travel.get("price");
            Travel TravelTemp = new Travel(from,to,price,distance,time);
            ListTravel.add(TravelTemp);
        }
        System.out.println(ListTravel.toString());
        System.out.println(ListTravel.compareTo("Paris","London"));



    }/*
        Travel Travel1 = new Travel("Paris","London",185,469.6f,"5 hours");
        Travel Travel2 = new Travel("Paris","London",105,469.6f,"10 hours");
        Travel Travel3 = new Travel("Paris","London",275,469.6f,"2 hours 30");
        ListTravel.add(Travel1);
        ListTravel.add(Travel2);
        ListTravel.add(Travel3);
        System.out.println("Output");
        System.out.println(Travel1.getPrice());
        System.out.println(ListTravel.toString());
        System.out.println(ListTravel.compareTo("Paris","London"));
    }*/
}
