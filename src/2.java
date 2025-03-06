

import java.util.Random;
public class RandomMathProblem {

    public static void main(String[] args) {
        int number1 = new Random().nextInt(10); // Generate a random number between 0 and 9
        int number2 = new Random().nextInt(10); // Generate another random number between 0 and 9
        int answer;
        String operation;

        if (new Random().nextBoolean()) {
            // If the boolean is true, we will perform addition
            answer = number1 + number2;
            operation = "+";
        } else {
            // If the boolean is false, we will perform subtraction
            answer = number1 - number2;
            operation = "-";
        }

        System.out.println(number1 + " " + operation + " " + number2 + " = ");
    }
}