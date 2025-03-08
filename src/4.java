import java.util.Random;

public class MathProblem {
  private static Random rand = new Random();
  
  public static String getMathProblem() {
    int num1 = rand.nextInt(10);
    int num2 = rand.nextInt(10);
    char op = (char) ('+' + rand.nextInt(3));
    
    switch (op) {
      case '+': return String.format("What is %d + %d?", num1, num2);
      case '-': return String.format("What is %d - %d?", num1, num2);
      case '*': return String.format("What is %d * %d?", num1, num2);
    }
    
    throw new RuntimeException("Invalid operator");
  }
}
