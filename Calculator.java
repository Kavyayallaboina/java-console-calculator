import java.util.Scanner;
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;
        while (continueCalc) {
            System.out.println("\n===== BASIC JAVA CALCULATOR =====");
            System.out.println("1. Addition\n2.Subtraction\n3.Miltiplication\n4.Division\n5.Exit");
            System.out.print("Choose an operation (1-5): ");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting calculator... Thank you!");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice! Please choose between 1 and 5.");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String again = sc.next();

            if (!again.equalsIgnoreCase("yes")) {
                continueCalc = false;
            }
        }
        sc.close();
        System.out.println("Calculator closed.");
    }
}