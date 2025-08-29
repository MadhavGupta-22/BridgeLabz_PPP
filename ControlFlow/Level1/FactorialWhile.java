package ControlFlow.Level1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " = " + fact);
        } else {
            System.out.println("Not a valid input");
        }
        sc.close();
    }
    
}
