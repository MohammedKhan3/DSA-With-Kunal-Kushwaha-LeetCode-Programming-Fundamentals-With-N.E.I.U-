/**
 * Write a program that has the class name Problem2 and that has the main method.
 * • In the main method, prompt the user to enter positive integers until the user enters either
 * a value that is less than or equal to 0 or when the number entered is less than or equal
 * to the number entered previously.
 * • A step is a positive difference between an entered integer and the value entered prior
 * to that integer. Calculate the number of big steps (differences of more than 5) and the
 * number of small steps (differences of less than or equal to 5).
 * • Print out the big steps and the small steps and the number that caused the program to
 * end.
 * • Several sample runs are provided for you below. Your output must be formatted exactly
 * like the sample runs below.
 * Enter a positive integer: -10
 * Big steps: 0
 * Small steps: 0
 * Ending value: -10
 * Enter a positive integer: 1
 * Enter a positive integer: -3
 * Big steps: 0
 * Small steps: 0
 * Ending value: -3
 * Enter a positive integer: 4
 * Enter a positive integer: 12
 * Enter a positive integer: 13
 * Enter a positive integer: 15
 * Enter a positive integer: 21
 * Enter a positive integer: 26
 * Enter a positive integer: 21
 * Big steps: 2
 * Small steps: 3
 * Ending value: 21
 * Enter a positive integer: 71
 * Enter a positive integer: 72
 * Enter a positive integer: 72
 * Big steps: 0
 * Small steps: 1
 * Ending value: 72
 * Enter a positive integer: 45
 * Enter a positive integer: 62
 * Enter a positive integer: 0
 * Big steps: 1
 * Small steps: 0
 * Ending value: 0
 */

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bigSteps = 0;
        int smallSteps = 0;
        int previousNumber = 0;
        int currentNumber;
        boolean firstInput = true;

        while (true) {
            System.out.print("Enter a positive integer: ");
            currentNumber = scanner.nextInt();


            if (currentNumber <= 0 || (!firstInput && currentNumber <= previousNumber)) {
                break;
            }


            if (!firstInput) {
                int difference = currentNumber - previousNumber;
                if (difference > 5) {
                    bigSteps++;
                } else {
                    smallSteps++;
                }
            } else {
                firstInput = false;
            }

            previousNumber = currentNumber;
        }

        System.out.println("Big steps: " + bigSteps);
        System.out.println("Small steps: " + smallSteps);
        System.out.println("Ending value: " + currentNumber);
    }
}
