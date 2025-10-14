import service.ExpenseManager;
import model.Expense;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        manager.addExpense(500, "Food", "2025-10-13", "Lunch at Cafe");
        manager.addExpense(1200, "Shopping", "2025-10-12", "T-shirt purchase");
        manager.addExpense(300, "Transport", "2025-10-12", "Cab fare");

        System.out.println("All Expenses:");
        for (Expense e : manager.getAllExpenses()) {
            System.out.println(e);
        }

        System.out.println("\nTotal Expense: " + manager.getTotalExpense());
        System.out.println("Total on Food: " + manager.getTotalByCategory("Food"));

        manager.deleteExpense(2);
        System.out.println("\nAfter deleting expense with ID 2:");
        for (Expense e : manager.getAllExpenses()) {
            System.out.println(e);
        }
    }
}
