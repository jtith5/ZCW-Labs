import java.util.*; 
/**
 * Write a description of class PayDay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayDay
{
    public static String payDay(String name, Double payPerHour, Double hoursWorked, Double deductionRate) { 
    Double subTotal = payPerHour*hoursWorked;
    Double deductionTotal = deductionRate*subTotal;
    Double total = subTotal - deductionTotal;
    String str = String.format(name + " " + subTotal + " " + deductionTotal + " " + total);
    return str; 
}
}
