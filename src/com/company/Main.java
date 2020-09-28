package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.print(max);
    }
}
