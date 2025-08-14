import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true){
            char op = in.next().trim().charAt(0);

            if(op=='+' || op =='-' || op == '*' || op == '/' || op == '%'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op=='+'){
                    sum = num1 + num2;
                    System.out.println("sum = " + sum);
                }
                if(op=='-'){
                    sum = num1 - num2;
                    System.out.println("sum = " + sum);
                }
                if(op=='*'){
                    sum = num1 * num2;
                    System.out.println("sum = " + sum);
                }
                if(op=='/'){
                    sum = num1 / num2;
                    System.out.println("sum = " + sum);
                }
                if(op=='%'){
                    sum = num1 % num2;
                    System.out.println("sum = " + sum);
                }


            }
        }




    }
}
