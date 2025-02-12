# 💰 Stock Portfolio Tracker 💰

Keep track of your investments and monitor your portfolio's performance with this easy-to-use Stock Portfolio Tracker!  Add stocks, view your holdings, and get a clear picture of your investment portfolio.

## ✨ Key Features ✨

*   **Add Stocks:** Easily add new stocks to your portfolio, including their symbol, name, price, and quantity.
*   **View Portfolio:**  See a detailed overview of your current stock holdings, including their value.
*   **Input Validation:**  Handles invalid user input gracefully, preventing errors and ensuring data integrity.
*   **Clean Output:** Presents your portfolio information in a clear and readable format.

## 🚀 How to Run 🚀

1.  **Download:** Download the `Stock.java` and `StockPortfolioTracker.java` files.  (Or, if you are using the single-file version, download that file, `StockPortfolioTracker.java`).
2.  **Compile:** Open a terminal or command prompt and navigate to the directory where you saved the files. Compile both files (or the single file if you chose that option):
    ```bash
    javac Stock.java          // If using separate files (compile Stock first!)
    javac StockPortfolioTracker.java // Compile the tracker
    ```
    Or, if you're using the single-file version:
    ```bash
    javac StockPortfolioTracker.java
    ```

3.  **Run:** Execute the `StockPortfolioTracker` application:
    ```bash
    java StockPortfolioTracker
    ```

4.  **Use the Menu:** Follow the on-screen menu prompts to add stocks, view your portfolio, or exit the application.

## 💡 How it Works 💡

*   **Stock Class:** The `Stock` class represents a single stock holding.  It stores the stock's symbol, name, price, and quantity. It also has a method to calculate the total value of the holding.
*   **StockPortfolioTracker Class:**  This class manages the portfolio. It uses an `ArrayList` to store the `Stock` objects.  It provides a menu-driven interface for adding stocks and viewing the portfolio.  Input validation is used to ensure that the user enters valid data.

## 💻 Tech Stack 💻

*   Java

## 🧰 Dependencies 🧰

*   None (Standard Java Library)

## 💡 Code Explanation (Key Parts) 💡

*   **`ArrayList`:** Used to store the `Stock` objects in the portfolio.
*   **`Scanner`:** Used to get user input from the console.
*   **Input Validation:**  `try-catch` blocks are used to handle `InputMismatchException` and ensure that the user enters valid numeric input.
*   **`toString()` Method:** The `Stock` class has a `toString()` method for easy printing of stock information.

## 🎉 Start Tracking Your Investments! 🎉
