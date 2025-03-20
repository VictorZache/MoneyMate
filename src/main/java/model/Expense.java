package model;

import java.time.LocalDate;

public class Expense {
    private double amount;
    private LocalDate date;
    private String category;

    public Expense(double amount, LocalDate date, String category){
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Expense(double amount, LocalDate date){
        this.amount = amount;
        this.date = date;
        this.category = "???";
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return "Expense: $" + amount + " for " + category + " on " + date;
    }
}
