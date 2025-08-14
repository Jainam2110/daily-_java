import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number :-");
        int n = in.nextInt();
        int result = 0;

        while(n>0){
            int rem = n%10;
            n/= 10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
