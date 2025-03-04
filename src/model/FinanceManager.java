package model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


// Essa parte do código define uma classe chamada FinanceManager e cria três listas para
// armazenar receitas, despesas e investimentos.
public class FinanceManager {
    private List<Expense> expenses;
    private List<Income> incomes;
    private List<Investment> investments;

    //Dentro do construtor, as três listas (incomes, expenses, e investments) são inicializadas
    // como novas instâncias de ArrayList, ou seja, elas começam vazias.
    public FinanceManager(){
        this.expenses = new ArrayList<>();
        this.incomes = new ArrayList<>();
        this.investments = new ArrayList<>();
    }

    public void addIncome(double amount, LocalDate date, String source){
        Income income = new Income(amount, date, source);
        incomes.add(income);
    }

    public void addExpense(double amount, LocalDate date, String category) {
        Expense expense = new Expense(amount, date, category);
        expenses.add(expense);
    }

    public void addInvestment(double amount, LocalDate date, String type, double expectedReturn) {
        Investment investment = new Investment(amount, date, type, expectedReturn);
        investments.add(investment);
    }

    public void listIncomes(){
        System.out.println("Incomes");
        for(Income income : incomes){
            System.out.println(income);
        }
    }

    public void listExpenses(){
        System.out.println("Expense");
        for(Expense expense : expenses){
            System.out.println(expense);
        }
    }

    public void listInvestments(){
        System.out.println("Investmente");
        for (Investment investment : investments){
            System.out.println(investment);
        }
    }

    public double calculateBalance(){
        double totalIncomes = 0;
        double totalExpenses = 0;

        for(Income income : incomes){
            totalIncomes += income.getAmount();
        }

        for(Expense expense : expenses){
            totalExpenses += expense.getAmount();
        }

        return totalIncomes - totalExpenses;
    }

    public double calculateExpectedReturn() {
        double totalExpectedReturn = 0;
        for (Investment investment : investments) {
            totalExpectedReturn += investment.getAmount() * (investment.getExpectedReturn() / 100);
        }
        return totalExpectedReturn;
    }


}
