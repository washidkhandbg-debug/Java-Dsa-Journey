package Basics_Java;

import java.util.Scanner;

public class primitive {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " +  rollno);
    }
}
