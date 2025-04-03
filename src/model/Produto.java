package model;

public class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private String fabricante;
    private int estoqueId;
    private String quantidade;

    // Construtor vazio
    public Produto() {}

    public Produto(int idProduto, String nome, String descricao, String fabricante, int estoqueId, String quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.fabricante = fabricante;
        this.estoqueId = estoqueId;
        this.quantidade = quantidade;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

  

    // Getters e Setterss
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getEstoqueId() {
        return estoqueId;
    }

    public void setEstoqueId(int estoqueId) {
        this.estoqueId = estoqueId;
    }
}
