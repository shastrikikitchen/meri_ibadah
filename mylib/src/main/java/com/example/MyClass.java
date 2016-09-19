package com.example;

public class MyClass {
    public static void main(String args[]) {
        String s = "1234567890";
        String firstPart = s.substring(0, 3);
        StringBuilder stars = new StringBuilder();
        for(int i = 3;i<s.length();i++){
            stars.append("*");
        }
        String fin = firstPart+stars;


        System.out.println("Final String is  " + fin);

    }
}
