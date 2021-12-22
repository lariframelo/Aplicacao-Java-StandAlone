package entidade;

public class Produto {
    String nome;
    String preco;
    String qtdEstoque;
    String categoria;

    public Produto(String nome, String preco, String qtdEstoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

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
    @Override
    public String toString() {
        return "[ nome:" + nome + ", preço:" + preco + ", Quantidade: " + qtdEstoque + ", categoria: "
                + categoria + "]";
    }
}
