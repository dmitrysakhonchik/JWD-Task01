package by.sakhonchik.task01.subtask07;

import java.util.Scanner;

public class ProximityOfPoints {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getAnswer());
    }

    private static String getAnswer() {
        System.out.println("First point coordinates");
        double firstPoint = getPointCoordinates();
        System.out.println("Second point coordinates");
        double secondPoint = getPointCoordinates();

        if (firstPoint < secondPoint) {
            return "First point closer to the origin of the coordinate";
        } else if (secondPoint < firstPoint) {
            return "Second point closer to the origin of the coordinate";
        } else {
            return "The points are evenly spaced from the origin of the coordinates.";
        }

    }

    public static double getPointCoordinates() {
        double x = getNumberEnteredByUser();
        double y = getNumberEnteredByUser();

        return Math.sqrt(x * x + y * y);
    }

    public static double getNumberEnteredByUser() {
        String numberEnteredByUser;
        System.out.println("Enter number:");
        while (!isCorrectDigit(numberEnteredByUser = scanner.nextLine())) {
            System.out.println("Incorrect value");
            System.out.println("Enter number");
        }
        return Double.parseDouble(numberEnteredByUser);
    }

    public static boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            double number = Double.parseDouble(numberEnteredByUser);
            return true;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
