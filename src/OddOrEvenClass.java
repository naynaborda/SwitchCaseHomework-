import java.util.Scanner;

public class OddOrEvenClass {
    //Create a method that takes an integer as an argument and return even or odd
    public static void oddOrEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to test if it is odd or even:");
                switch (scanner.nextInt()%2){
            case 0:
                System.out.println("Given Number is Even");
                break;
            default:
                System.out.println("Given Number is Odd");
        }
    }

    public static void main(String[] args) {
        oddOrEven();
    }
}
