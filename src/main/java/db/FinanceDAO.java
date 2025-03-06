package db;

import model.*;
import java.sql.*;

public class FinanceDAO {

    public static void insertIncome(Income income) {
        String sql = "INSERT INTO income (amount, income_date, income_source) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, income.getAmount());
            statement.setDate(2, java.sql.Date.valueOf(income.getDate()));
            statement.setString(3, income.getSource());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void insertExpense(Expense expense) {
        String sql = "INSERT INTO expense (amount, expense_date, category) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, expense.getAmount());
            statement.setDate(2, java.sql.Date.valueOf(expense.getDate()));
            statement.setString(3, expense.getCategory());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void insertInvestment(Investment investment) {
        String sql = "INSERT INTO investment (amount, investment_date, investment_type, expected_return) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, investment.getAmount());
            statement.setDate(2, java.sql.Date.valueOf(investment.getDate()));
            statement.setString(3, investment.getType());
            statement.setDouble(4, investment.getExpectedReturn());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
