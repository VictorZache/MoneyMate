package app;

import db.*;
import model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FinanceManager manager = new FinanceManager();

        // Adicionando receitas
        manager.addIncome(3000.0, LocalDate.now(), "Salary");
        manager.addIncome(500.0, LocalDate.now(), "Freelance");

        // Adicionando despesas
        manager.addExpense(1000.0, LocalDate.now(), "Rent");
        manager.addExpense(200.0, LocalDate.now(), "Food");

        // Adicionando investimentos
        manager.addInvestment(5000.0, LocalDate.now(), "Stocks", 7.5); // Rendimento de 7,5%

        // Listando os registros
        manager.listIncomes();
        manager.listExpenses();
        manager.listInvestments();

        // Calculando o saldo
        double balance = manager.calculateBalance();
        System.out.println("Balance: $" + balance);

        // Calculando o rendimento esperado total
        double expectedReturn = manager.calculateExpectedReturn();
        System.out.println("Expected Return: $" + expectedReturn);
    }
}
