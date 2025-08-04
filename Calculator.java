import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    // Stores the last result (memory feature)
    private static double memory = 0.0;

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division (safe)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    // Power
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Square Root
    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot take square root of negative!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            System.out.println("==== Java Console Calculator ====");
            while (running) {
                System.out.println("\nOptions:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Square Root");
                System.out.println("7. Recall Memory");
                System.out.println("8. Clear Memory");
                System.out.println("9. Exit");
                System.out.print("Your choice: ");

                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, enter a number.");
                    scanner.nextLine(); // clear buffer
                    continue;
                }

                double result = 0;

                switch (choice) {
                    case 1 -> {
                        double a = getNumber(scanner, "First number: ");
                        double b = getNumber(scanner, "Second number: ");
                        result = add(a, b);
                        storeAndPrint(result);
                    }
                    case 2 -> {
                        double a = getNumber(scanner, "First number: ");
                        double b = getNumber(scanner, "Second number: ");
                        result = subtract(a, b);
                        storeAndPrint(result);
                    }
                    case 3 -> {
                        double a = getNumber(scanner, "First number: ");
                        double b = getNumber(scanner, "Second number: ");
                        result = multiply(a, b);
                        storeAndPrint(result);
                    }
                    case 4 -> {
                        double a = getNumber(scanner, "Dividend: ");
                        double b = getNumber(scanner, "Divisor: ");
                        result = divide(a, b);
                        storeAndPrint(result);
                    }
                    case 5 -> {
                        double a = getNumber(scanner, "Base: ");
                        double b = getNumber(scanner, "Exponent: ");
                        result = power(a, b);
                        storeAndPrint(result);
                    }
                    case 6 -> {
                        double a = getNumber(scanner, "Number: ");
                        result = squareRoot(a);
                        storeAndPrint(result);
                    }
                    case 7 -> System.out.println("Memory: " + memory);
                    case 8 -> {
                        memory = 0.0;
                        System.out.println("Memory cleared.");
                    }
                    case 9 -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
    }

    private static double getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.next(); // clear buffer
            }
        }
    }

    private static void storeAndPrint(double result) {
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
            memory = result;
        }
    }
}
