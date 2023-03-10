import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        int choice;
        System.out.println("Welcome to the scientific calculator!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Square Root\n7. Logarithm\n8. Sine\n9. Cosine\n10. Tangent");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Please enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Please enter the second number:");
                num2 = sc.nextDouble();
                result = num1 + num2;
                System.out.println("The result is " + result);
                break;
            case 2:
                System.out.println("Please enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Please enter the second number:");
                num2 = sc.nextDouble();
                result = num1 - num2;
                System.out.println("The result is " + result);
                break;
            case 3:
                System.out.println("Please enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Please enter the second number:");
                num2 = sc.nextDouble();
                result = num1 * num2;
                System.out.println("The result is " + result);
                break;
            case 4:
                System.out.println("Please enter the first number:");
                num1 = sc.nextDouble();
                System.out.println("Please enter the second number:");
                num2 = sc.nextDouble();
                result = num1 / num2;
                System.out.println("The result is " + result);
                break;
            case 5:
                System.out.println("Please enter the base number:");
                num1 = sc.nextDouble();
                System.out.println("Please enter the exponent number:");
                num2 = sc.nextDouble();
                result = Math.pow(num1, num2);
                System.out.println("The result is " + result);
                break;
            case 6:
                System.out.println("Please enter the number:");
                num1 = sc.nextDouble();
                result = Math.sqrt(num1);
                System.out.println("The result is " + result);
                break;
            case 7:
                System.out.println("Please enter the number:");
                num1 = sc.nextDouble();
                result = Math.log(num1);
                System.out.println("The result is " + result);
                break;
            case 8:
                System.out.println("Please enter the number (in degrees):");
                num1 = sc.nextDouble();
                result = Math.sin(Math.toRadians(num1));
                System.out.println("The result is " + result);
                break;
            case 9:
                System.out.println("Please enter the number (in degrees):");
                num1 = sc.nextDouble();
                result = Math.cos(Math.toRadians(num1));
                System.out.println("The result is " + result);
                break;
            case 10:
                System.out.println("Please enter the number (in degrees):");
                num1 = sc.nextDouble();
                result = Math.tan(Math.toRadians(num1));
                System.out.println("The result is " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
   sc.close();
    }
    
    
}



