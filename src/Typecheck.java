import java.util.Scanner;

public class Typecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char name = in.next().trim().charAt(0);

        if(name>= 'a' && name<= 'z'){
            System.out.println("this is lowercase");
        } else{
            System.out.println("this is uppercase");
        }

    }
}
