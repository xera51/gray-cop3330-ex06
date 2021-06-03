/*
 *  UCF COP3330 Summer 2021 Exercise 6 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_is_correctly_formatted() {
        App myApp = new App();
        int testCurrentAge = 25;
        int testRetireAge = 65;

        String expectedOutput = String.format("You have 40 years left until you can retire.%n" +
                "It's 2021, so you can retire in 2061.");
        String actualOutput = myApp.generateOutputString(testCurrentAge, testRetireAge);

        assertEquals(expectedOutput, actualOutput);
    }
}