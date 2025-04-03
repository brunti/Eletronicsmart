package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Funcionario;
import util.Conexao;

public class FuncionarioDAO {
    public void cadastrarFuncionario(Funcionario funcionario) {
        String sql = "INSERT INTO Cadastro_Funcionario (nome, sobrenome, cpf, email, logradouro, bairro, cidade, estado, cep, telefone, cargo_id)\n" +
"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getSobrenome());
            stmt.setString(3, funcionario.getCpf());
            stmt.setString(4, funcionario.getEmail());
            stmt.setString(5, funcionario.getLogradouro());
            stmt.setString(6, funcionario.getBairro());
            stmt.setString(7, funcionario.getCidade());
            stmt.setString(8, funcionario.getEstado());
            stmt.setString(9, funcionario.getCep());
            stmt.setString(10, funcionario.getTelefone());
            stmt.setInt(11, funcionario.getCargoId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário: " + e.getMessage());
        }
    }
}
