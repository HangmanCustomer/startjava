import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter the first number");
        calc.setA(scanner.nextInt());
        System.out.println("Enter the operation");
        calc.setCh(scanner.next().charAt(0));
        System.out.println("Enter the second number");
        calc.setB(scanner.nextInt());
        calc.calcMath();
    }
}
