package com.example.initialpart;

public class VariablesDataTypes {

    public static void main(String[] args) {

        // int => 32bit
        // 2진수 => 00000000_00000000_00000000_00000000
        // 16진수 => ff_ff_ff_ff

        int i1 = 10; //10진수
        int i2 = 0b10; // 2진수
        int i3 = 0x10; // 16진수
        int i4 = 010; // 8진수

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        int i5 = 0b0000_0000_0000_0000_0000_0000_0000_1100;
        System.out.println(i5);

        int i6 = 0b0000_0000_0000_0000_0000_0000_0001_0101; // 21
        int i7 = 0b1111_1111_1111_1111_1111_1111_1110_1011; // -21

        System.out.println(i6);
        System.out.println(i7);
        System.out.println(i6+i7);

        int j1 = 0b0101_1111_1010_0000_1100_1111_0101_0101; //
        int j2 = 0b1010_0000_0101_1111_0011_0000_1010_1011; //

        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j1+j2);
    }
}
