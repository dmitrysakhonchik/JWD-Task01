package by.sakhonchik.task01.subtask01;

/**
 * @author Dmitry Sakhonchik
 */
public class LastDigitOfASquare {


    public double getLastDigitOfASquare(String number) {
        double answer = 0;
        if (isCorrectDigit(number)) {
            double lastDigitOfNumber = Double.parseDouble(number) % 10;
            answer = lastDigitOfNumber * lastDigitOfNumber % 10;
        }

        return answer;

    }

    public boolean isCorrectDigit(String numberEnteredByUser) {
        try {
            double number = Double.parseDouble(numberEnteredByUser);
            return number != 0;

        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
