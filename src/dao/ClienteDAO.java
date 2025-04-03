package dao;

import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import util.Conexao;
import java.sql.SQLException;

public class ClienteDAO {
    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO Cadastro_Cliente (nome, sobrenome, cpf, email, logradouro, bairro, cidade, estado, cep, telefone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSobrenome());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getLogradouro());
            stmt.setString(6, cliente.getBairro());
            stmt.setString(7, cliente.getCidade());
            stmt.setString(8, cliente.getEstado());
            stmt.setString(9, cliente.getCep());
            stmt.setString(10, cliente.getTelefone());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e.getMessage());
        }
    }
}
