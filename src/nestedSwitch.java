
import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("please enter the EmpID:-");
        int empID = input.nextInt();
        System.out.print("please enter the department:-");
        String Department = input.next();


        switch(empID)
        {
            case 1 -> System.out.println("jainam kothari");

            case 2 -> System.out.println("naresh kothari");

            case 3 -> {
            switch(Department){
                case "IT":
                System.out.println("IT department");

                case "Management":
                System.out.println("Management department");

                default:
                System.out.println("no department entered");
            }
        }


        }

    }
    
}
