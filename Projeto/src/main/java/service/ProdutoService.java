package service;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    int autoId = 0;

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public List<Produto> listaProdutos() {
        return this.produtos;
    }

    public void deletaProduto(Produto produto) {
        produtos.remove(produto);
        System.out.println("Apagando produto " + produto.getNome() + "...");
        produto = null;
        System.out.println("Produto removido com sucesso!");
    }

    public void saveOrUpdateProduto(Produto produto) {
        if (produtos.contains(produto)) {
            System.out.println("Produto " + produto.getNome() +
                    " atualizado com sucesso!");
        } else {
            produtos.add(produto);
            System.out.println("Produto salvo com sucesso!");
        }
    }

    public void createProduto() {
        Produto p = new Produto(++autoId);
        saveOrUpdate(p);
        System.out.println("Produto " + p.getNome() + "Incluído com sucesso");
    }

    public Produto getProduto(int nome) {
        Produto produto = null;
        for (Produto prod : produtos) {
            if (prod.getId() == nome) {
                produto = prod;
            }
        }

        return produto;
    }
}

