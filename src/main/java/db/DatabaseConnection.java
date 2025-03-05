package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/finance_manager";
    private static final String USER = "root";
    private static final String PASSWORD = "Hellstar97!";

    public static Connection getConnection() throws SQLException {
    try{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    } catch (SQLException e){
        throw new SQLException("Erro ao conectar ao banco de dados." , e);
        }
    }
}
