package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        String yesOrNo = "y";
        while(yesOrNo.equals("y")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What we need to compute?\n");
            System.out.print("compute: ");
            calc.setA(scanner.nextLine());
            calc.calcMath();
            do{
//                String[] b = {"0", "0", "0"};
//                calc.setB(b);
                System.out.print("Repeat calculate press [Y/N] ");
                yesOrNo = scanner.next();

             } while(!yesOrNo.equals("y") && !yesOrNo.equals("n"));
        }
        System.out.println("Calculator is close");
    }
}
