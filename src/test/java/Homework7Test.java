import homework7.Homework7;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class Homework7Test {


    @Test
    public void getDayTest() {
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        for (int i = 1; i <= 7; i++) {
            String getDayList = Homework7.getDay(i);
            String daysList = days[i - 1];
            assertEquals(daysList, getDayList);
            assertTrue(daysList==getDayList);
        }
    }

    @Test
    public void value0() {
        String zero = "The number should be equal or larger than 1";
        String getDayList = Homework7.getDay(0);
        assertNotNull(getDayList);
        assertEquals(zero, getDayList);
    }

    @Test
    public void valueAbove7() {
        String valueAbove7 = "The number should be equal or smaller than 7";
        for (int i = 8; i >= 100; i++) {
            String getDayList = Homework7.getDay(i);
            assertEquals(valueAbove7, getDayList);
        }

    }

    @Test
    public void valueNull() {
        assertThrows(NullPointerException.class, () -> {
            Homework7.getDay(null);
        });
    }


}
