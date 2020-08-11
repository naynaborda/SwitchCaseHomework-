import java.util.Scanner;

public class StationNameClass {
    //No return type with parameter
    //Input Underground station and print which line is going there
    public static void stationName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Underground station name: ");
        switch (scanner.nextLine()){
            case "Northolt Station":
                System.out.println("Northolt station has Central line:");
                break;
            case "Sudbury Hill Station":
                System.out.println("Sudbury Hill station has Piccadilly line:");
                break;
            case "Wembley Central Station":
                System.out.println("Wembley Central station has Bakerloo line:");
                break;
            case "Ealing broadway Station":
                System.out.println("Ealing Broadway Station has District line");
                break;
            case "Harrow on the hill Station":
                System.out.println("Harrow on the hill station has Metropolitan line");
                break;
             default:
                System.out.println("Not valid Underground station");

        }

    }

    public static void main(String[] args) {
        stationName();
    }
}
