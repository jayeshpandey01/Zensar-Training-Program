// package Day_02;

/*
pre-incement: first increase the value by 1 then use it.
post-increment: first use the value then increase it by 1.
 */

import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =10, num2 = 20;
        System.out.println("Sum of two numbers is: " + (num++ + ++num2));
        /*
        logical operators: >, <, ==, !=, >=, <=
         */
        System.out.println(num);
        System.out.println("value of num > num2: " + (num > num2));
        System.out.println(num < num2);
        System.out.println(num == num2);
        System.out.println(num != num2);
        System.out.println(num >= num2);
        System.out.println(num <= num2);

        int a , b;
        System.out.print("Enter a numbers: ");
        a = sc.nextInt();
        // nextInt() is used to take integer input from the user.
        System.out.print("Enter b number: ");
        b = sc.nextInt();
        System.out.println("Sum of two numbers is: " + (a + b));
    }
}
