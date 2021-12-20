package Controller;


import dao.ProdutoDao;
import model.Produto;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    int autoId = 0;
    ProdutoDao dao = new ProdutoDao();

    public void createProduto() {
        Produto p = new Produto(++autoId);
        saveOrUpdate(p);
        System.out.println("Produto " + p.getNome() + "Incluído com sucesso");
    }


    public boolean validaProduto(Produto p) {
        return ((p.getNome() != null) && (p.getDescricao() != null)
                && !(p.getDescricao().isEmpty()) && !(p.getNome().isEmpty()));
    }

    public void listaProdutos() {
        List<Produto> lista = dao.listaProdutos();

        if (!lista.isEmpty()) {
            System.out.println("|id \t |Nome \t |Preço \t |Qtd \t |Categoria " +
                    "\n==============================");

            for (Produto produto : lista) {
                System.out.println(produto.getId() + "\t" +
                        produto.getNome() + "\t" + produto.getDescricao());
            }
        }
        else {
            System.out.println("Não existem produtos cadastrados");
        }
    }

    public void prepareDelete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe código do Produto que deseja excluir: ");
        Produto p = dao.getProduto(scanner.nextInt());

        if (p != null) {
            dao.deletaProduto(p);
        }
        else {
            System.out.println("Código de Produto inexistente.");
        }
    }

    public void prepareUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do Produto que deseja alterar: ");
        Produto p = dao.getProduto(scanner.nextInt());

        if (p != null) {
            saveOrUpdate(p);
        }
        else {
            System.out.println("Produto inexistente.");
        }
    }

    public void saveOrUpdate(Produto p) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();
        if (nome != null && !nome.isEmpty()) {
            p.setNome(nome);
        }

        System.out.print("Preço: ");
        Double preco = scanner.nextDouble();
        if (preco != null) {
            p.setPreco(preco);
        }

        System.out.print("Quantidade:  ");
        int qtdEstoque = scanner.nextInt();
        if (qtdEstoque > 0) {
            p.setQtdEstoque(qtdEstoque);
        }

        System.out.print("Categoria:  ");
        String categoria = scanner2.nextLine();
        p.setCategoria(categoria);


        if (validaProduto(p)) {
            dao.saveOrUpdateProduto(p);
        }



    }
}








