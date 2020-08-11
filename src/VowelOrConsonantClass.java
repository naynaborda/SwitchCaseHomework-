import java.util.Scanner;

public class VowelOrConsonantClass {
    //WAP that takes any alphabet and print vowel or consonant depending on the user input.
    public static void vowelOrConsonant(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a any alphabet to test if if is vowel or consonant:");
        switch (scanner.next()){
            case"a":
                System.out.println("Vowel");
                break;
            case"e":
                System.out.println("Vowel");
                break;
            case"i":
                System.out.println("Vowel");
                break;
            case"o":
                System.out.println("Vowel");
                break;
            case"u":
                System.out.println("Vowel");
                break;
            case"A":
                System.out.println("Vowel");
                break;
            case"E":
                System.out.println("Vowel");
                break;
            case"I":
                System.out.println("Vowel");
                break;
            case"O":
                System.out.println("Vowel");
                break;
            case"U":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;

        }
    }

    public static void main(String[] args) {
        vowelOrConsonant();
    }
}
