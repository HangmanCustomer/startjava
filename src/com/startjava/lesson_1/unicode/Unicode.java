package com.startjava.lesson_1.unicode;
 public class Unicode{
    public static void main(String[] args) {
        int a = 33;
        int b = 126;
        char ch;
        for (;a <= b;a++){
            ch = (char) a;
            System.out.println(ch);
        }
    }
}