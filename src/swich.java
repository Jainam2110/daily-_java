
import java.util.Scanner;

public class swich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name of the fruit:-");
        String fruit = input.next();

        switch (fruit) {

            case "mango":
            System.out.println("The King of fruits");
            break;

            case "Apple":
            System.out.println("the red and sweet fruit");
            break;

            case "orange":
            System.out.println("the tangy and sweet fruit");
            break;

            default:
            System.out.println(">This fruit in not matches...");




        }



    }
    
}
