package service;

import entidade.ListaProduto;
import entidade.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Métodos de manuseio dos produtos
// como adicionar, editar e excluir produto
public class Metodos {


    ArrayList<String> listaProduto = new ArrayList<>();


    public static void incluirProduto(ArrayList<String> listaProduto) {
        //esse método faz todo trabalho de cadastro

        Scanner lerNome = new Scanner(System.in);
        Scanner lerPreco = new Scanner(System.in);
        Scanner lerQtd = new Scanner(System.in);
        Scanner lerCategoria = new Scanner(System.in);

        System.out.print("Nome do produto:");
        String nome = lerNome.nextLine();


        System.out.print("Preço do produto:");
        String preco = lerPreco.nextLine();


        System.out.printf("Quantidade:");
        String qtdEstoque = lerQtd.nextLine();


        System.out.printf("Categoria:");
        String categoria = lerCategoria.nextLine();

        lerNome.close();
        lerPreco.close();
        lerQtd.close();
        lerCategoria.close();

        //gravar os dados no final da lista
        listaProduto.add(nome + ";" + preco + ";" + qtdEstoque + ";" + categoria);
        System.out.println("Produto incluído com sucesso ");
    }

    public static void listar(ArrayList<String> listaProduto) {
        System.out.printf("\nListando os produtos:\n");
        int i, n = listaProduto.size();
        for (i = 0; i < n; i++) {
            System.out.printf("Posição: %s\n", i, listaProduto.get(i));
        }
        System.out.printf("---------------------------------------");
    }

    public static void excluir(ArrayList<String> listaProduto) {
        Scanner ler = new Scanner(System.in);
        int i;

        listar(listaProduto);

        System.out.printf("\nInforme a posição a ser excluida:\n");
        i = ler.nextInt();

        try {
            listaProduto.remove(i);
        } catch (IndexOutOfBoundsException e) {
            // exceção lançada para indicar o indice
            // esta fora do intervalo válido
            System.out.printf("\nErro: posição inválida (%s).\n\n",
                    e.getMessage());
        }
    }

    public static void alterarProduto(ArrayList<String> listaProduto) {
        int i;
        Scanner ler = new Scanner(System.in);

        System.out.println("\nAlterar cadastro Produto:\n");
        System.out.println("\nAdicionar os dados do produto: ");

        System.out.printf("\nNome do produto:\n");
        String nome = ler.nextLine();
        System.out.printf("\nPreço do produto:\n");
        Double preco = ler.nextDouble();
        System.out.printf("\nQuantidade:\n");
        int qtdEstoque = ler.nextInt();
        System.out.printf("\nCategoria:\n");
        String categoria = ler.nextLine();

        listar(listaProduto);
        System.out.printf("\nInforme a posição a ser editada:\n");
        i = ler.nextInt();
        try {
            listaProduto.set(i, nome + ";" + preco + ";" + qtdEstoque + ";" + categoria);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nErro: posição inválida (%s).\n\n",
                    e.getMessage());
            listar(listaProduto);
            System.out.println("Produto modificado com sucesso ! ");


        }

    }

    public static void importar(ArrayList<String> listaProduto) {
        try {
            FileReader arq = new FileReader("listaProduto.csv");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                listaProduto.add(linha);
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.",
                    e.getMessage());
        }
    }

    public static void exportar(ArrayList<String> listaProduto)
            throws IOException {
        FileWriter arq = new FileWriter("agenda.csv");
        PrintWriter gravarArq = new PrintWriter(arq);
        int i, n = listaProduto.size();
        for (i=0; i<n; i++) {
            gravarArq.printf("Posição", listaProduto.get(i));
        }
        gravarArq.close();
    }

}