 import java.util.Random;
 
 public class MathProblems {
     private static final Random rand = new Random();
     
     public static String generateMathProblem(int numberOfVariables) {
         // Generate a random math problem with the given number of variables
         
         int operator = rand.nextInt(4); // 0: +, 1: -, 2: x, 3: /
         int operand1 = rand.nextInt(10) + 1;
         int operand2 = rand.nextInt(10) + 1;
         
         String problem = "";
         
         switch (operator) {
             case 0: // addition
                 problem += operand1 + " + " + operand2;
                 break;
             case 1: // subtraction
                 problem += operand1 + " - " + operand2;
                 break;
             case 2: // multiplication
                 problem += operand1 + " x " + operand2;
                 break;
             case 3: // division
                 problem += operand1 + " / " + operand2;
                 break;
         }
         
         return problem;
     }
 }