package Task_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(input);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Your age is: " + age.getYears() + " years, " +
                           age.getMonths() + " months, and " +
                           age.getDays() + " days.");
    }
}

