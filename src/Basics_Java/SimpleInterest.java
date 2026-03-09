package Basics_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a princial value: ");
        double principal = sc.nextDouble();
        System.out.print("enter a rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("enter time in year: ");
        double time = sc.nextDouble();
        double si = (principal * rate * time)/ 100;
        System.out.println("simple interest = " + si);
        sc.close();
    }
}
