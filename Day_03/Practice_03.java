// To-Do List

import java.util.Scanner;

public class Practice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int count = sc.nextInt();
        double sum = 0;
        System.out.println("Enter the elements: ");

        for (int i = 0; i < count; i++) {
            sum += sc.nextDouble();
        }
        System.out.println("Sum of the elements: " + sum);
        double average = sum / count;
        System.out.println("Average of the elements: " + average);
        sc.close();
    }
}
