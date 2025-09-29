//Student's name: Santiago Montes
//Group: 10B
//Date: 22/09/2025
//Topic: Java

import java.util.Scanner;

/**
 * This program prompts the user to enter three numbers
 * and then calculates and displays their sum.
 */
public class SumOfThreeNumbers {

    public static void main(String[] args) {

        // 1. Create a Scanner object to read user input.
        // This is necessary for the program to interact with the keyboard.
        Scanner scanner = new Scanner(System.in);

        // 2. Ask the user to enter the first number.
        System.out.println("Please enter the first number:");

        // 3. Read the first number entered by the user and store it
        // in a 'double' type variable. We use 'double' to allow for
        // numbers with decimals.
        double number1 = scanner.nextDouble();

        // 4. Ask the user to enter the second number.
        System.out.println("Please enter the second number:");

        // 5. Read the second number and store it in another variable.
        double number2 = scanner.nextDouble();

        System.out.println("Please enter the third number:");

        // 6. Read the third number and store it in another variable.
        double number3 = scanner.nextDouble();

        // 7. Calculate the sum of the three numbers.
        double sum = number1 + number2 + number3;

        // 8. Display the sum to the user.
        // A descriptive message is used to make the result clear.
        System.out.println("The sum of " + number1 + " and " + number2 + " and " + number3 + " is: " + sum);

        // 9. Close the Scanner object.
        // This is a good practice to free up system resources.
        scanner.close();
    }
}
