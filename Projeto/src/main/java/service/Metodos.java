package service;

import entidade.Produto;

import java.util.ArrayList;
import java.util.Scanner;

//Métodos de manuseio dos produtos
// como adicionar, editar e excluir produto
public class Metodos {


    public static void incluirProduto() {
        //esse método faz todo trabalho de cadastro
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        Produto p = new Produto();
        Scanner ler = new Scanner(System.in);

        System.out.printf("\nNome do produto:\n");
        String nome = ler.nextLine();
        p.setNome(nome);

        System.out.printf("\nPreço do produto:\n");
        Double preco = ler.nextDouble();

        p.setPreco(preco);

        System.out.printf("\nQuantidade:\n");
        int qtdEstoque = ler.nextInt();
        p.setQtdEstoque(qtdEstoque);

        System.out.printf("\nCategoria:\n");
        String categoria = ler.nextLine();
        p.setCategoria(categoria);

        //gravar os dados no final da lista
        listaProduto.add(p);

    }


    public static void editarProduto() {
        listar(listaProduto);

    }
    public static void excluir(ArrayList<Produto> listaProduto) {
        Scanner ler = new Scanner(System.in);
        int i;

        listar(listaProduto);

        System.out.printf("\nInforme a posição a ser excluída:\n");
        i = ler.nextInt();

        try {
            listaProduto.remove(i);
        } catch (IndexOutOfBoundsException e) {

            System.out.printf("\nErro: posição inválida.\n\n",
                    e.getMessage());
        }

        public static void (ArrayList <Produto> listaProduto) {
            System.out.printf("\nListadando os produtos:\n");
            int i, n = listaProduto.size();
            for (i = 0; i < n; i++) {
                System.out.printf("Posição\n", i, listaProduto.get(i));
            }
            System.out.printf("---------------------------------------");
        }

        public boolean calculaPreco() {
            boolean precoFinal;
            boolean imposto = (preco/100) * 30;
            boolean lucro = (preco/100) * 45;
            precoFinal = preco + imposto + lucro;

            return precoFinal;
        }



