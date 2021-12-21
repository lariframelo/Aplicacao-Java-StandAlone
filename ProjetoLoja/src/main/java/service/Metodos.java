package service;

import entidade.Produto;

import java.util.ArrayList;
import java.util.Scanner;

//Métodos de manuseio dos produtos
// como adicionar, editar e excluir produto
public class Metodos {


    public static void incluirProduto(ArrayList<String> listaProduto) {
        //esse método faz todo trabalho de cadastro

        Scanner ler = new Scanner(System.in);

        System.out.printf("\nNome do produto:\n");
        String nome = ler.nextLine();


        System.out.printf("\nPreço do produto:\n");
        Double preco = ler.nextDouble();


        System.out.printf("\nQuantidade:\n");
        int qtdEstoque = ler.nextInt();


        System.out.printf("\nCategoria:\n");
        String categoria = ler.nextLine();


        //gravar os dados no final da lista
        listaProduto.add(nome + ";" + preco);

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

        public double calculaPreco(double preco){
            double precoFinal;
            double imposto = (preco / 100) * 30;
            double lucro = (preco / 100) * 45;
            precoFinal = preco + imposto + lucro;

            return precoFinal;
        }


