
package entities;


public class Produtos {
    private int id;
    private String nome;
    private int quantidade;
    private double valorProduto;

    public Produtos() {
    }

    public Produtos(int id, String nome, int quantidade, double valorProduto) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
 
    
}
