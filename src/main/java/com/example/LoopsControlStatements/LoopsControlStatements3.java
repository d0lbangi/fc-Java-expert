package com.example.LoopsControlStatements;

import java.util.Scanner;

public class LoopsControlStatements3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dan = scanner.nextInt();

        /*
        for (int i=1; i<10; i++) {
            System.out.println(dan + "*"+ i + "=" + dan*i);
        }
        */

        /*
        int i = 1;
        while ( i <= 9) {
            System.out.println(dan + "*" + i + "=" + dan * i);
            i++;
        }
        */

        int i = 1;
        do {
            System.out.println(dan + "*" + i + "=" + dan * i);
            i++;
        } while (i<=9);
    }
}
