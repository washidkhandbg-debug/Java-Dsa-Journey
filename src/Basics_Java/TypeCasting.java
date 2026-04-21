package Basics_Java;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       //float num = input.nextFloat();
    int num = (int)(67.56f);
  // System.out.println(num);

    // automatic type promotion in expressions
       // int a = 257;
      //  byte b = (byte)(a); // 257 % 256 = 1
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/c;
//        System.out.println(d);

      // int number = 'A';
       //System.out.println(3 * 5.63436);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        float result = (f * b) + ((float) i / c) - (float)(d - s);
        System.out.println((f *b) + " "+ ( i/ c) + " " + (d-s));


        System.out.println(result);

    }
}

