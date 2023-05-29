package com.example.LoopsControlStatements;

public class LoopsControlStatements {

    public static void main(String[] args){

        int age = 15;
        String item = "";
        String subItem = "";

        System.out.println("조건시작!");

        // 성인인지 확인
        if(age > 19) {
            item = "item1";
            subItem = "서브아이템1";
        } else if(age > 14) {
            item = "item2";
            subItem = "서브아이템2";
        } else {
            item = "없음";
            subItem = "없음";
        }

        System.out.println("조건끝!");
        System.out.println("item = " + item);
        System.out.println("subItem = " + subItem);
    }
}
