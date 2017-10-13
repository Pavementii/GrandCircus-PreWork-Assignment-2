package com.robinsondetroit;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year1;
        int month1;
        int dayOfMonth1;

        int year2;
        int month2;
        int dayOfMonth2;

        System.out.println("\nFor my next trick, I will tell you the duration between two dates in years, months, and days.");
        System.out.println("Please enter the first date by entering the YEAR");
        year1 = sc.nextInt();

        System.out.println("Next enter the MONTH of the first date:");
        month1 = sc.nextInt();

        System.out.println("And now enter the DAY of the month of the first date:");
        dayOfMonth1 = sc.nextInt();

        System.out.println("\nNow let's do the same for the second date. Please enter the YEAR:");
        year2 = sc.nextInt();

        System.out.println("Now the MONTH of the second date:");
        month2 = sc.nextInt();

        System.out.println("And finally, the DAY of the month of the second date:");
        dayOfMonth2 = sc.nextInt();

        LocalDate firstDate = LocalDate.of(year1, month1, dayOfMonth1);
        LocalDate secondDate = LocalDate.of(year2, month2, dayOfMonth2);

        long daysElapsed = ChronoUnit.DAYS.between(firstDate, secondDate);
        long monthsElapsed = ChronoUnit.MONTHS.between(firstDate, secondDate);
        long yearsElapsed = ChronoUnit.YEARS.between(firstDate, secondDate);

        System.out.println("\nAnd the difference between the two dates is.... [drumroll please]...");
        System.out.println(daysElapsed + " days");
        System.out.println(monthsElapsed + " months");
        System.out.println(yearsElapsed + " years\n");

        System.out.println("This is equivolent to " + yearsElapsed + " years, " + (monthsElapsed % 12) + " months, and " +
                (daysElapsed % 365 % 30) + " days!!!");
    }

}
