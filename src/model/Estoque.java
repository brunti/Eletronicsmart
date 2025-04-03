package model;

public class Estoque {
    private int idEstoque;
    private int quantidadeEmEstoque;

    // Getters e Setters

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Estoque(int idEstoque, int quantidadeEmEstoque) {
        this.idEstoque = idEstoque;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    
}
