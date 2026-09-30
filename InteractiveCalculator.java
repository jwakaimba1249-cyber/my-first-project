import java.util.Scanner;
public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("INTERACTIVE CALCULATOR");
        System.out.println("======================");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Let's do some calculations.");
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;
        boolean validDivision = false;
        if (num2 != 0) {
            quotient = num1 / num2;
            validDivision = true;
        }
        System.out.println("========================");
        System.out.println("    RESULTS FOR" +name.toUpperCase());
        System.out.println("========================");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("------------------------");
        System.out.println("Addition:"+ num1 +"+"+num2+"="+sum);
        System.out.println("Subtraction:"+ num1 +"-"+num2+"="+difference);
        System.out.println("Multiplication:"+ num1 +"*"+num2+"="+product);
        if (validDivision) {
            System.out.println("Division:"+ num1 +"/"+num2+"="+quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }
        double average = (num1 + num2) / 2;
        System.out.println("Average:"+average);
        System.out.println("========================");
        System.out.println("Thank you for using the Interactive Calculator, " + name + "!");
        scanner.close();
        

    }
} 