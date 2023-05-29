package com.example.LoopsControlStatements;

import java.util.Scanner;

    // swtich (exp)
    // 연산식의 결과 값에 따라 여러 개의 실행 경로 중 하나를 실행
    // 표현식 exp 결과 값 중에서 case 값과 일치하는 내부 문장을 실행

    // exp
    // 정수형 값이 옴, 열거형, 문자열이 올 수 있음

    // break 문
    // 조건에 값을 실행 후 break를 통해서 switch문 종료, 없다면 계속 실행

public class LoopsControlStatements2 {

    public static void main(String[] args){
    // 1,2,3,4,5,6,7,8,9,10,11,12
    // 31,28,31,30,31,300,31,31,30,31,30,31

    Scanner scanner = new Scanner(System.in);
    int month = scanner.nextInt();
    int day = 0;

    // swtich 문
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            day = 31;
            break;

        case 2:
            day = 28;
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            day = 30;
            break;

        default:
            System.out.println("month값이 유효하지 않습니다.");

    }

    // if 문
//    if (month == 1) {
//        day = 31;
//    } else if (month == 2) {
//        day = 28;
//    } else if (month == 3) {
//        day = 31;
//    } else if (month == 4) {
//        day = 30;
//    } else if (month == 5) {
//        day = 31;
//    } else if (month == 6) {
//        day = 31;
//    } else if (month == 7) {
//        day = 31;
//    } else if (month == 8) {
//        day = 31;
//    } else if (month == 9) {
//        day = 30;
//    } else if (month == 10) {
//        day = 31;
//    } else if (month == 11) {
//        day = 30;
//    } else if (month == 12) {
//        day = 31;
//    } else {
//        System.out.println("month값이 유효하지 않습니다.");
//    }
        System.out.println("day:" + day);
    }
}