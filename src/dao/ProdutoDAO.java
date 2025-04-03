package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.Conexao; // Supondo que tenha uma classe para conectar ao banco

public class ProdutoDAO {

    // Método para cadastrar um produto no banco de dados
    public void cadastrarProduto(Produto produto) {
        String sql = "INSERT INTO cadastro_produtos (nome_do_produto, descricao, fabricante, estoque_id, quantidade) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setString(3, produto.getFabricante());
            stmt.setInt(4, produto.getEstoqueId());
            stmt.setString(5, produto.getQuantidade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e.getMessage());
        }
    }

    public void listarEstoque(JTable tabela) {
        String sql = "SELECT id_produto, quantidade FROM cadastro_produtos";
        
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

            while (rs.next()) {
                int idProduto = rs.getInt("id_produto");
                String quantidade = rs.getString("quantidade");

                model.addRow(new Object[]{idProduto, quantidade});
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao listar estoque: " + e.getMessage());
        }
    }
    
}
