import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try (Scanner Calc = new Scanner(System.in)) {
            int number1;
            int number2;
            int Answer;

            System.out.println("Enter the first number: ");
            number1 = Calc.nextInt();
            Calc.nextLine();  // consume the newline

            System.out.println("Enter the second number:" );
            number2 = Calc.nextInt();
            Calc.nextLine();  // consume the newline

            System.out.println("Select the order of operation: ");
            char operator = Calc.nextLine().charAt(0);


            if (operator == '+') {
                Answer = (number1 + number2);
                System.out.println("Answer:" + Answer);
                } 
            if (operator == '-') {
                Answer = (number1 - number2);
                System.out.println("Answer:" + Answer);
                } 
            if (operator == '*') {
                Answer = (number1 * number2);
                System.out.println("Answer:" + Answer);
                } 
            if (operator == '/') {
                Answer = (number1/number2);
                System.out.println("Answer:" + Answer);
                } 
            else {
                System.out.println("not implemented yet. Sorry!");
            }
        }


    }

}
