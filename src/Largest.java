import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        Q: find the largest number amoung these numbers

        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }


    }
}
