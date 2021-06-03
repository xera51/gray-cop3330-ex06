/*
 *  UCF COP3330 Summer 2021 Exercise 6 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.time.Year;
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int currentAge = myApp.readCurrentAge();
        int retirementAge = myApp.readRetirementAge();
        String output = myApp.generateOutputString(currentAge, retirementAge);

        myApp.displayOutput(output);
    }

    public int readCurrentAge() {
        System.out.print("What is your current age? ");
        return Integer.parseInt(in.nextLine());
    }

    public int readRetirementAge() {
        System.out.print("At what age would you like to retire? ");
        return Integer.parseInt(in.nextLine());
    }

    public String generateOutputString(int currentAge, int retireAge) {
        int year = Year.now().getValue();
        int timeToRetire = retireAge - currentAge;
        return String.format("You have %d years left until you can retire.%n" +
                "It's %d, so you can retire in %d.", timeToRetire, year, year + timeToRetire);
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }

}
