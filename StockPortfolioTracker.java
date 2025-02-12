import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Stock { // Default (package-private) visibility - ONLY ONE public class allowed per file
    private String symbol;
    private String name;
    private double price;
    private int quantity;

    public Stock(String symbol, String name, double price, int quantity) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getValue() {
        return price * quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol + "\n" +
               "Name: " + name + "\n" +
               "Price: $" + price + "\n" +
               "Quantity: " + quantity + "\n" +
               "Value: $" + getValue() + "\n";
    }
}

public class StockPortfolioTracker { // ONLY this class can be public in this file
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Stock> portfolio = new ArrayList<>();

        while (true) {
            // ... (rest of the StockPortfolioTracker code - same as before)
            System.out.println("Stock Portfolio Tracker Menu:");
            System.out.println("1. Add Stock");
            System.out.println("2. View Portfolio");
            System.out.println("3. Exit");
            System.out.print("Select an option (1/2/3): ");

            int option = getValidIntInput(scanner, 1, 3); // Get validated integer input

            switch (option) {
                case 1:
                    scanner.nextLine(); // Consume newline left by nextInt()
                    System.out.print("Enter stock symbol: ");
                    String symbol = scanner.nextLine();
                    System.out.print("Enter stock name: ");
                    String name = scanner.nextLine();

                    double price = getValidDoubleInput(scanner, "Enter stock price: $");
                    int quantity = getValidIntInput(scanner, "Enter quantity: ");

                    portfolio.add(new Stock(symbol, name, price, quantity));
                    System.out.println("Stock added successfully.");
                    break;

                case 2:
                    if (portfolio.isEmpty()) {
                        System.out.println("Your portfolio is empty.");
                    } else {
                        System.out.println("Stock Portfolio:");
                        for (Stock stock : portfolio) {
                            System.out.println(stock); // Uses the toString() method
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the Stock Portfolio Tracker.");
                    scanner.close();
                    System.exit(0);

                default: // Should not happen due to input validation
                    System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        }
    }


    // Input validation methods
    private static int getValidIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    private static int getValidIntInput(Scanner scanner, int min, int max) {
        while (true) {
            int input = getValidIntInput(scanner, " "); // Call the other method
            if (input >= min && input <= max) {
                return input;
            } else {
                System.out.println("Input must be between " + min + " and " + max + ".");
            }
        }
    }


    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}