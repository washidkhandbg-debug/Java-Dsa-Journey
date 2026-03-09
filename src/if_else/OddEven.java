package if_else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sb.nextInt();
        if(n%2 == 0) {
            System.out.println("even Number");
        }
        else {
            System.out.println("odd Number");
        }
    }
}
