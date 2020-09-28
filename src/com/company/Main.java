
package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j  < 10; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
            k += 9;
            for (int  j = 0; j < 10; j++) {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
            k += 11 ;
        }
    }
}
