

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PayDayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PayDayTest
{
    @Test
    public void PaydayTest() {
        // : Given
        
        String expected = "Kris 215.00 10.75 204.25";
        String name = "Kris";
        Double payPerHour = 21.5;
        Double hoursWorked = 10.0;
        Double deductionRate = 0.05;
        

        // : When
        String actual = PayDay.payDay(name,payPerHour,hoursWorked,deductionRate);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
