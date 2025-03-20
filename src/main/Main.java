package main;

import db.*;
import model.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        // Criando instâncias de Income, Expense e Investment
        Income income = new Income(3000.0, LocalDate.now(), "Salary");
        Expense expense = new Expense(1000.0, LocalDate.now(), "Rent");
        Investment investment = new Investment(5000.0, LocalDate.now(), "Stocks", 7.5);

        // Inserindo no banco de dados
        FinanceDAO.insertIncome(income);
        FinanceDAO.insertExpense(expense);
        FinanceDAO.insertInvestment(investment);

        System.out.println("Data inserted successfully!");
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");



        while(true){
            System.out.println("Oque deseja fazer?");
            System.out.println("Opções:");
            System.out.println("1. Adicionar Renda. \n" +
                    "2. Adicionar Despesa. \n" +
                    "3. Adiconar Investimento.\n");

            int op = scanner.nextInt();

            switch (op){
                case 1:
                    System.out.println("Qual o valor recebido?");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Deseja adicionar uma fonte? s/n");
                    String resposta = scanner.nextLine().toLowerCase();

                    Income income;
                    if (resposta.equals("s")){
                        System.out.println("Digite qual a origem:");
                        String source = scanner.nextLine();
                        income = new Income(amount, LocalDate.now(), source);

                    } else if (resposta.equals("n")) {
                        income = new Income(amount, LocalDate.now());

                    }else{
                        System.out.println("Erro, valor resposta não reconhecida.");
                        break;
                    }

                    FinanceDAO.insertIncome(income);
                    System.out.println("Renda adicionada: " + income);


                    break;



            }

        }

        //Investment investment = new Investment(2000.0, LocalDate.of(2025, 3, 7), "Stocks", 10.0);
        //System.out.println(investment);

    }
}
