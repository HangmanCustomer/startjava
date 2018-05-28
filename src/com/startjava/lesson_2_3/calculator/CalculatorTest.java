package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String yesOrNo = "y";
        while(yesOrNo.equals("y")){
            System.out.println("Begining calculate\n");
            System.out.print("Enter the first number ");
            calc.setA(scanner.nextInt());
            System.out.print("Enter the operation ");
            calc.setCh(scanner.next().charAt(0));
            System.out.print("Enter the second number ");
            calc.setB(scanner.nextInt());
            calc.calcMath();
            do{
            System.out.print("Repeat calculate press [Y/N] ");
            yesOrNo = scanner.next();
             } while(!yesOrNo.equals("y") && !yesOrNo.equals("n"));
        }
        System.out.println("Calculator is close");
    }
}
