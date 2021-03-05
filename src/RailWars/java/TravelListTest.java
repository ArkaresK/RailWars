package RailWars.java;

import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
class TravelListTest {

    @Mock
    TravelList mockService;

    private static TravelList mainList;

    private static TravelList testList ;

    @BeforeAll static void setup() throws IOException, ParseException {
        mainList = new TravelList();
        Travel Travel1 = new Travel("Paris","London",185,469.6f,"5 hours","train");
        Travel Travel2 = new Travel("Madrid","Paris",105,469.6f,"10 hours","bus");
        Travel Travel3 = new Travel("Berlin","London",275,469.6f,"2 hours 30","airplane");
        mainList.add(Travel1);
        mainList.add(Travel2);
        mainList.add(Travel3);
    }

    @Test
    public void travelFromTest() {
        String s = "Result for research travel from Paris :\n" +
                " - Paris to London for 185.0€ in 5 hours (469.6 km) by train\n";
        assertEquals(s,mainList.travelFrom("Paris"));
        /*assertEquals(new Travel("Paris","London",185,469.6f,"5 hours","train"),mainList.travelFrom("London"));*/
    }
    @Test
    public void containsTest(){
        assertEquals(true,mainList.contains("Paris"));
        assertEquals(false,mainList.contains("Hong Kong"));
        assertEquals(true,mainList.contains("London"));
    }
}