package main;

import db.*;
import model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*    // Criando instâncias de Income, Expense e Investment
        Income income = new Income(3000.0, LocalDate.now(), "Salary");
        Expense expense = new Expense(1000.0, LocalDate.now(), "Rent");
        Investment investment = new Investment(5000.0, LocalDate.now(), "Stocks", 7.5);

        // Inserindo no banco de dados
        FinanceDAO.insertIncome(income);
        FinanceDAO.insertExpense(expense);
        FinanceDAO.insertInvestment(investment);

        System.out.println("Data inserted successfully!"); */

        Scanner input = new Scanner(System.in);
        System.out.println("MENU");

        int cont = 0;

        while(cont <= 0){
            System.out.println("Oque deseja fazer?");
            System.out.println("Opções:");
            System.out.println("1. Adicionar Renda. \n" +
                    "2. Adicionar Despesa. \n" +
                    "3. Adiconar Investimento.\n");

            if(cont == 1){

            }

        }

    }
}
