package com.example.LoopsControlStatements;

import java.util.Arrays;

public class LoopsControlStatements4 {

    public static void main(String[] args) {

        String[] str = {"호길동", "이순신", "세종대왕"};

        for (int i=0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        for(String s : str){
            System.out.println(s);
        }

        Arrays.stream(str).forEach(e -> {
            System.out.println(e);
        });
    }
}
