package class_package.classes;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {

        /*System.out.println(converterFromCelsiusToFahrenheit(10));

        System.out.println(compareMagnitudeOfNumbers(5, -8));*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int userFirstNumber = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int userSecondNumber = scanner.nextInt();

        System.out.println("The biggest of "
                + userFirstNumber + " and "
                + userSecondNumber + " = "
                + compareMagnitudeOfNumbers(userFirstNumber, userSecondNumber));

        // 10 C = 50 F
        // 10 C = 283 K
    }

    public static int converterFromCelsiusToFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static int compareMagnitudeOfNumbers(int firstNumber, int secondNumber) {
        /*if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
            return firstNumber;
        } else {
            return secondNumber;
        }*/

        return Math.abs(firstNumber) > Math.abs(secondNumber) ? firstNumber : secondNumber;
    }
}
