package com.edu.chmnu.ki_123.c3;

import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.sin;

public class MathInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            double x, a, b, c;
            System.out.print("Write the x value ");
            if(scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                System.out.print("Write the a value ");
                if(scanner.hasNextDouble())
                {
                    a = scanner.nextDouble();
                    System.out.print("Write the b value ");
                    if(scanner.hasNextDouble())
                    {
                        b = scanner.nextDouble();
                        System.out.print("Write the c value ");
                        if(scanner.hasNextDouble())
                        {
                            c = scanner.nextDouble();
                            double y = exp(-a * x) * cos(b * x + c) + exp(a * x) * sin(c * x - 1);
                            System.out.printf("Result is %.3f", y);
                        }
                        else {
                            System.err.print("You have written wrong c value");
                        }
                    }
                    else
                    {
                        System.err.print("You have written wrong b value");
                    }
                }
                else
                {
                    System.err.print("You haven't write right the a value");
                }

               //double y = exp(-a * x) * cos(b * x + c) + exp(a * x) * sin(c * x - 1);
                //System.out.printf("Result is %.3f", y);
            }
            else
            {
                System.err.print("You haven't written right the x value");
            }
        }
    }
}
