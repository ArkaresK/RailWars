package RailWars.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
class TravelTest {

    @Mock
    Travel mockService;

    private static Travel firstTravel;

    @BeforeAll static void setup(){
        firstTravel = new Travel("Paris","New York",367,5756,"4 hours 47","airplane");
        Travel secondTravel = new Travel("Paris", "Athènes", 156, 2115, "3 hours 10", "airplane");
    }

    @Test
    public void travel_price() {
        assertEquals(367,firstTravel.getPrice());
    }
}