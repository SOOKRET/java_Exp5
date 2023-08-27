import org.calculator.Arithmetic;
import org.calculator.CalcPower;

public class Demo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Using Arithmetic class methods
        int sum = Arithmetic.add(num1, num2);
        int difference = Arithmetic.subtract(num1, num2);
        int product = Arithmetic.multiply(num1, num2);
        double quotient = Arithmetic.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Using CalcPower class methods
        int squared = CalcPower.square(num1);
        int cubed = CalcPower.cube(num1);

        System.out.println("Square: " + squared);
        System.out.println("Cube: " + cubed);
    }
}
