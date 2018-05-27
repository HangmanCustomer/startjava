package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String yesOrNo = "Y";
        while(yesOrNo.equals("Y")){
            System.out.println("Begining calculate\n");
            System.out.println("Enter the first number");
            calc.setA(scanner.nextInt());
            System.out.println("Enter the operation");
            calc.setCh(scanner.next().charAt(0));
            System.out.println("Enter the second number");
            calc.setB(scanner.nextInt());
            calc.calcMath();
            do{
            System.out.println("Repeat calculate press [Y/N]");
            yesOrNo = scanner.next();
             } while(!yesOrNo.equals("Y") && !yesOrNo.equals("N"));
        }
        System.out.println("Calculator is close");
    }
}
