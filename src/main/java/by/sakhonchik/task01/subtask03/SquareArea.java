package by.sakhonchik.task01.subtask03;

public class SquareArea {

    public double getSquareArea(String externalSquareArea) {
        double answer;
        double sideOfASquare;
        double circleRadius;
        double innerSquareArea;
        double exSquareArea;

        exSquareArea = getExternalSquareArea(externalSquareArea);
        sideOfASquare = Math.sqrt(exSquareArea);
        circleRadius = sideOfASquare / 2;
        innerSquareArea = 0.5 * circleRadius * circleRadius * 4;
        answer = exSquareArea / innerSquareArea;

        return answer;
    }

    public boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            double number = Double.parseDouble(numberEnteredByUser);
            return number > 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public double getExternalSquareArea(String number) {
        double externalSquareArea = 0;
        if (isCorrectDigit(number)) {
            externalSquareArea = Double.parseDouble(number);
            return externalSquareArea;
        }
        return externalSquareArea;
    }


}
