package model;

import java.time.LocalDate;


public class Investment {
    private double amount;
    private LocalDate date;
    private String type;
    private Double expectedReturn;

    public Investment(double amount, LocalDate date, String type, Double expectedReturn) {
        this.amount = amount;
        this.date = date;
        this.type = type;
        this.expectedReturn = expectedReturn;
    }

    public Investment(double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
        this.type = "Unknown";
        this.expectedReturn = 0.0;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getExpectedReturn() {
        return expectedReturn;
    }

    public void setExpectedReturn(Double expectedReturn) {
        this.expectedReturn = expectedReturn;
    }

    @Override
    public String toString() {
        return String.format("Investment: $%.2f in %s on %s with expected return: %.2f%%",
                amount, type, date, expectedReturn);
    }
}



