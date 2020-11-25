package by.sakhonchik.task01.subtask09;

import java.util.Scanner;

public class CircumferenceAndAreaOfACircle {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double radius = getNumberEnteredByUser();
        double circumference = 2 * Math.PI * radius;
        double areaOfACircle = Math.PI * radius * radius;
        System.out.println("Circumference: " + circumference
                + "\nArea of a circle: " + areaOfACircle);

    }

    public static double getNumberEnteredByUser() {
        String numberEnteredByUser;
        System.out.println("Enter radius:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter radius");
        }
        return Double.parseDouble(numberEnteredByUser);
    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            double number = Double.parseDouble(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
