package model;

import java.util.Collection;

public class Produto {
    public String nome;
    public Double preco;
    public int qtdEstoque;
    public String categoria;
    public int id;

    public Produto( String nome, Double preco, int qtdEstoque, String categoria, int id) {
        
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.categoria = categoria;

    }
    public Produto(int i) {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Collection<Object> getDescricao() {
        return null;
    }


}


