import java.util.Scanner;

public class CityNameClass {
    /*Input any alphabet from a to f and print their city name accordingly any other
    alphabet should e invalid entry
     */
    //no return type with no parameter
    public void cityName(){

        Scanner scanner = new Scanner(System.in);
        //entering alphabet to know their city name
        System.out.print("Enter a alphabet from a to f:");
        switch (scanner.next()){
            case "a":
                System.out.println("America");
                break;
            case "b":
                System.out.println("Bombay");
                break;
            case "c":
                System.out.println("China");
                break;
            case "d":
                System.out.println("Delhi");
                break;
            case "e":
                System.out.println("Egypt");
                break;
            case "f":
                System.out.println("France");
                break;
            default:
                System.out.println("invalid entry");
                break;


        }

    }

    public static void main(String[] args) {
        CityNameClass cityNameClass=new CityNameClass();
        CityNameClass cityNameClass1=new CityNameClass();

        cityNameClass.cityName();


    }
}
