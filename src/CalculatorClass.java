import java.util.Scanner;

public class CalculatorClass {
    /* create a function that takes two numbers and  a mathematical operator+-/* and will perform a calculation with
       given numbers.
        */
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number1 for calculator:");
        int num1 = scanner.nextInt();
        System.out.print("Enter number2 for calculator:");
        int num2 = scanner.nextInt();
        System.out.print("Enter an operator for calculator:");
        char operator = scanner.next().charAt(0);
        int output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                System.out.println(num1 + " " + operator + num2 + "= " + output);
                break;
            case '-':
                output = num1 - num2;
                System.out.println(num1 + " " + operator + num2 + "= " + output);
                break;
            case '*':
                output = num1 * num2;
                System.out.println(num1 + " " + operator + num2 + "= " + output);
                break;
            case '/':
                output = num1 / num2;
                System.out.println(num1 + " " + operator + num2 + "= " + output);
                break;
            default:
                System.out.println("you have entered wrong operator");
        }

    }
    public static void main(String[] args) {
        calculator();
    }
}
