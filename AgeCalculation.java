// Problem 4

package tasksfive;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date of Birth to Calculate age (yyyy-mm-dd) : ");
        String dob = scanner.nextLine();     
        LocalDate birthdate = LocalDate.parse(dob); 
        LocalDate today = LocalDate.now(); 

        Period period = Period.between(birthdate, today); 
        // print year , month and day count using date functions
        System.out.println("Your age is " + period.getYears() + " years, " +
                period.getMonths() + " months, and " +
                period.getDays() + " days.");
    }
}