package entidade;

public class Product {
    private String nome;
    private String qtdEstoque;
    private String categoria;

    public Product(String nome, String qtdEstoque, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        this.qtdEstoque = qtdEstoque;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    /*
    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

     */

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return "|" + nome + "|" + categoria + "|" + qtdEstoque;
    }
}
