/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoproject;

/**
 *
 * @author Wavhu Budeli
 */
import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        double[] A =  {4,28,56,37,58,36,20,0.5, 36,46,32,25,37,22,2};
        double [] Answer = maxFactors(A);
        System.out.println(Answer[0] + " " + Answer[1]);
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
    }

    public static double[] minFactors(double[] B) {
        double max_1 = 0, max_2 = 0, fact1, fact2, product = Double.MAX_VALUE;
        for (int i = 0; i < B.length; i++) {
            fact1 = B[i];
            for (int j = i + 1; j < B.length; j++) {
                fact2 = B[j];
                if (fact1 * fact2 < product) {
                    product = fact1 * fact2;
                    max_1 = fact1;
                    max_2 = fact2;
                }
            }

        }
        double[] myarray = {max_1, max_2};
        return myarray;
    }

    public static double[] maxFactors(double[] B) {
        double max_1 = 0, max_2 = 0, fact1, fact2, product = 0;
        for (int i = 0; i < B.length; i++) {
            fact1 = B[i];
            for (int j = i + 1; j < B.length; j++) {
                fact2 = B[j];
                if (fact1 * fact2 > product) {
                    product = fact1 * fact2;
                    max_1 = fact1;
                    max_2 = fact2;
                }
            }

        }
        double[] myarray = {max_1, max_2};
        return myarray;
    }
}
