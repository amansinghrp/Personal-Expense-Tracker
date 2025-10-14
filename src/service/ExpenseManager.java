package service;
import model.Expense;

import java.lang.reflect.Array;
import  java.util.ArrayList;
public class ExpenseManager {
    private ArrayList<Expense> expenseList;
    private int nextId;

    public ExpenseManager(){
        expenseList = new ArrayList<>();
        nextId = 1;
    }

    public void addExpense(double amount, String category, String date, String description){
        Expense e = new Expense(nextId++, amount, category, date, description);
        expenseList.add(e);
    }

    public boolean deleteExpense(int id){
        for(Expense e : expenseList){
            if(e.getId() == id){
                expenseList.remove(e);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Expense> getAllExpenses(){
        return expenseList;
    }

    public double getTotalExpense(){
        double tot = 0;
        for(Expense e : expenseList){
            tot += e.getAmount();
        }
        return tot;
    }

    public double getTotalByCategory(String category){
        double tot = 0;
        for(Expense e : expenseList){
            if(e.getCategory() == category){
                tot += e.getAmount();
            }
        }
        return tot;
    }
}
