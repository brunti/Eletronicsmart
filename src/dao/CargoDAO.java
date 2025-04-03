package dao;

import model.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Conexao;

public class CargoDAO {
    
    public void cadastrarCargo(Cargo cargo) {
        String sql = "INSERT INTO cargo (nome, salario) VALUES (?, ?)";

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cargo.getNome());
            stmt.setDouble(2, cargo.getSalario());

            int resultado = stmt.executeUpdate();
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cargo cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cargo.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}
