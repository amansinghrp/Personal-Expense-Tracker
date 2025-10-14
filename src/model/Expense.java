package model;

public class Expense {
    private int id;
    private double amount;
    private String description;
    private String category;
    private String date;
    //constructor
    public Expense(int id, double amount, String category, String date, String description){
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    //getters
    public int getId(){
        return this.id;
    }

    public double getAmount(){
        return this.amount;
    }

    public String getCategory(){
        return this.category;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDate() {
        return date;
    }

    //setter
    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String toString(){
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
