package model;

import java.time.LocalDate;

public class Income {
    private double amount;
    private LocalDate date;
    private String source;

    //Parametros passados
    public Income(double amount, LocalDate date, String source) {
        this.amount = amount;
        this.date = date;
        this.source = source;
    }

    //Caso os parametros nao sejam passados
    public Income(double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
        this.source = "Unknown";

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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Income: $" + amount + " from " + source + " on " + date;
    }
}