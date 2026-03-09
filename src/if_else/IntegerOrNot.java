package if_else;
import java.util.Scanner;
public class IntegerOrNot {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x > 0)
            System.out.println("not an imteger");
        else
            System.out.println("is an integer");
    }
}
