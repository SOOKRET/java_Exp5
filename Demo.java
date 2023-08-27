import org.calculator.Arithmetic;
import org.calculator.CalcPower;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int num1;
        int num2,ch;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first number");
        num1 = sc.nextInt();
        System.out.println("enter your second number");
        num2 = sc.nextInt();

        // Using Arithmetic class methods
        int sum = Arithmetic.add(num1, num2);
        int difference = Arithmetic.subtract(num1, num2);
        int product = Arithmetic.multiply(num1, num2);
        double quotient = Arithmetic.divide(num1, num2);
        int squared = CalcPower.square(num1);
        int squared2 = CalcPower.square(num2);
        int cubed = CalcPower.cube(num1);
        int cubed2 = CalcPower.cube(num2);
        do {
        	System.out.println("what you want to do \n1.sum\n2.subtract\n3.multiply\n4.divide\n5.square\n6.cube\n7.exitt");
        	ch =sc.nextInt();
        	
        	switch(ch) {
        	case 1 : System.out.println("Sum: " + sum);
        	break;
        	
        	case 2:System.out.println("Difference: " + difference);
           	break;
           	
        	case 3:System.out.println("Product: " + product);
        	break;
        	
        	case 4:System.out.println("Quotient: " + quotient);
        	break;
        	
        	case 5:System.out.println("Square of first: " + squared);
        	System.out.println("Square of second: " + squared2);
        	break;
        	
        	case 6:System.out.println("Cube of first: " + cubed);
        	System.out.println("Cube of second: " + cubed2);
        	break;
        	
        	
        	default : System.out.println("end");
        	break;
        }}while(ch!=7);
        
      
    
 }
}
