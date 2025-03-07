import java.util.Random;

public class MathProblem {
    public static int getAnswer(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
