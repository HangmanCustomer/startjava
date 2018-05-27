package com.startjava.lesson_2_3.calculator;
public class Calculator {
    private int a;
    private int b;
    private char ch;

    public void calcMath() {
        switch (ch) {

            case '+':
                System.out.println("a+b=" + (a + b));
                break;
            case '-':
                System.out.println("a-b=" + (a - b));
                break;
            case '*':
                System.out.println("a*b=" + (a * b));
                break;
            case '/':
                double c;
                c = (double) a / b;
                System.out.println("a/b=" + c);
                break;
            case '^':
                int d = a;
                if (b == 0)
                    System.out.println("a^b=" + 1);
                else {
                    for (int i = 1; i < b; i++)
                        d = d * a;
                        System.out.println("a^b=" + d);
                    }
                break;
            case '%':
                System.out.println("a%b=" + (a % b));
                break;
            }
        }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setCh(char ch){
        this.ch = ch;
    }
}
