package com.example.Constant;

public class Constant {

    // 상수 -> 기본형(불린형, 정수, 실수, 문자형, 문자열)

    int i1 = 10;
    long l1 = 0XFFFFFFFFFFFL;
    long l2 =20L;
    double d1 = 3.1d;
    double d2 = 3.1E2;

    double d3 = 0x1.1P2;    // "p" or "P"를 통해서 16진수의 지수부를 표시함. ex) double 0x1,2P+1;

    int i11; // 선언
    int i12 = 10; // 선언과 대입

    String name = ""; // 일단 초기화해서 나쁜 것이 없다. 이 공간에 메모리가 차지하므로 낭비가 될 수는 있지만..
    String student = null; // 일단 초기화해서 나쁜 것이 없다.
    int age = 0; // 일단 초기화해서 나쁜 것이 없다

    public static void main(String[] args){
    char c1 = ' ';
    char c2 = '\0';
    char c3 = '\u0000';

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c1 == c2);
    System.out.println(c1 == c3);
    System.out.println(c2 == c3);

    // 멤버변수의 기본 값 : 기본값이란 선언만 되어져 있고 명시적으로 초기화를 하지 않는 경우를 말함
    // 지역변수의 경우 : 멤버변수와 달리 지역변수는 선언시 초기화(초기값 지정)를 하지 않고 선언을 할 수는 있지만, 이에 대한
    // 초기화가 없이 변수를 사용하려고 하면 컴파일 오류가 발생함. 따라서, 지역변수의 경우 사용전에는 반드시 초기화가 이루어져야 함
    // 초기화가 되었던 값을 대입했던 일단 지역변수에 값이 들어가야 함.
    }
}
