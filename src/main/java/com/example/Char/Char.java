package com.example.Char;

public class Char {

    public static void main(String[] args) {
        //문자형
        //문자형 ->

//        char c1 ='\ubc15';
//        char c2 = '\uaddc';
//        System.out.println(c1);
//        System.out.println(c2);

        char startValue = '\u0000';
        char endValue = '\uffff';
        char koStart = '\uac00';
        char koEnd = '\ud7af';

        System.out.print(startValue);
        System.out.println();
        System.out.print(endValue);
        System.out.println();
        System.out.print(koStart);
        System.out.println();
        System.out.print(koEnd);
        System.out.println();

        for(int i = startValue; i <= endValue; i++) {
            if (i >= (int)koStart && i <= (int)koEnd) {
                char c1 = (char) i;
                System.out.print(c1);
            }
        }
    }
}
