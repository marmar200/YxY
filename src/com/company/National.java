package com.company;

import java.util.Random;
import java.util.Scanner;

public class National {
    public static Scanner in = new Scanner(System.in);
// привет
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int [5];
        for (int i = 0; i < 5; i++) {
            a[i] = r.nextInt(100);
        }
        for (int  i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
