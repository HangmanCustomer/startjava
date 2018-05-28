package com.startjava.lesson_2_3.calculator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculator {
    private String stringA;
    private String[] compArray= new String[3];


    public void calcMath() {
        compArray = Arrays.copyOf(stringA.split(" ", 3),3);
        int a = Integer.parseInt(compArray[0]);
        int b = Integer.parseInt(compArray[2]);
        char ch = compArray[1].charAt(0);

        switch (ch) {

            case '+':
                System.out.println("= " + (a + b));
                break;
            case '-':
                System.out.println("= " + (a - b));
                break;
            case '*':
                System.out.println("= " + (a * b));
                break;
            case '/':
                double c;
                c = (double) a / b;
                System.out.println("= " + c);
                break;
            case '^':
                int d = a;
                if (b == 0)
                    System.out.println("= " + 1);
                else {
                    for (int i = 1; i < b; i++)
                        d = d * a;
                        System.out.println("= " + d);
                    }
                break;
            case '%':
                System.out.println("= " + (a % b));
                break;
            }
        }
    public void setA(String a)
    {
        stringA = a;
    }

}
