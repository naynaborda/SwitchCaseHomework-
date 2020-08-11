import java.util.Scanner;

public class PracticeForSwitchCase {
    //return type without parameter
    //in return type we don't need break but we must need default
    public static int test() {
        //1.first example with return type method
        // switch (10){
        //    case 20:
        //      System.out.println(20);
        //  case 10:
        //     System.out.println(10);
        // default:
        //    return 2;
        //2.first example we can do this way as well
        // switch (10){
        //    case 20:
        //        return 20+20;
        //   case 10:
        //        return 10+10;
        //   default:
        //       return 2;
        // }



//4.another example
         int a;
        switch (20) {
            case 20:
            a = 20 + 20;
             break;
          case 10:
               a = 10 + 20;
              break;
          default:
             a = 2;
         }
        return a;




        //1.no return type with no parameter
        //we can use break
        // public static void test(){
        // switch (10){
        //   case 20:
        //   System.out.println(20+20);
        //   break;
        // case 10:
        //  System.out.println(10+10);
        //    break;
        // default:
        //  System.out.println(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first example from prakash bhai tought us
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("No case");


        }
        //first example with scanner class

        System.out.print("enter a value for a:");
        switch (scanner.nextInt()) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            case 40:
                System.out.println("40");
                break;
            default:
                System.out.println("No case");
        }
        //if it is String than
        String b = "abc";
        switch (b) {
            case "abc":
                System.out.println("Prakash");
                break;
            default:
                System.out.println("a");
        }
        //1.calling first example with return type
        // test();
        //2. System.out.println(test());
        //1.calling no return type method
        //test();
        //4.calling return type method agian
        System.out.println(test());
        switch (test()) {
          case 20:
                System.out.println(20);
            case 40:
              System.out.println(60);
                break;
        }

        System.out.print("Enter a number to check if it is odd or even:");
        switch (scanner.nextInt() % 2) {
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
        }


    }
}






