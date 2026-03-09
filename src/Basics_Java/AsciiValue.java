package Basics_Java;

public class AsciiValue {
    public static void main(String[] args) {
// Q) What is Type Casting ?
// Ans) one data type to another data type conversion is known as Type casting .
        char ch = 'A';
        int x = ch;// implicit type casting .
        System.out.println(x);

        char Washid = 'a';
        int y = (int) Washid; //explicit type casting
        System.out.println(y);

        char harsh = '3';
        System.out.println((int) harsh);

    }


}
