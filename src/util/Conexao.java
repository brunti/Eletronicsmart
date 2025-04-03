package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
  
    
    private static final String URL = "jdbc:mysql://localhost:3306/electronicsmart";
    private static final String USER = "root"; // Altere se necessário
    private static final String PASSWORD = "bru@!08112020@!"; // Altere se necessário

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }
    //public static void main(String[] args) {
    //Connection conn = getConnection();
    //if (conn != null) {
    //    System.out.println("Conexão bem-sucedida!");
    //} else {
    //    System.out.println("Falha na conexão.");
    //}
//}
    
}

