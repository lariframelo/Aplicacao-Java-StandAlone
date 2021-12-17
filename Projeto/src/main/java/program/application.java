package program;

import Entities.Produto;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scOption;

        System.out.println(" Loja Online ");
        System.out.println("===================================");
        System.out.println("[1] - Adicionar novo produto ");
        System.out.println("[2] - Editar Produto ");
        System.out.println("[3] - Excluir Produto ");
        System.out.println("[4] - Importar Mostruário ");
        System.out.println("[5] - Sair ");
        System.out.print("Digite a opção para acessá-la: ");
        scOption = sc.nextInt();
        System.out.println("===================================");

        while (scOption == 1) {
            switch (scOption) {

                case 1:
                    Scanner scDados = new Scanner(System.in);
                    Produto produto = new Produto();


                    System.out.print("Nome: ");
                    produto.nome = scDados.nextLine();

                    System.out.print("Preço: ");
                    produto.preco = scDados.nextDouble();

                    System.out.print("Quantidade em estoque: ");
                    produto.qtdEstoque = scDados.nextInt();

                    System.out.print("Categoria: ");
                    produto.categoria = scDados.nextLine();
                    // falta transformar em arrayList
                    // tratamento de exceção
                    // colocar a opção para cancelar a operação
                    // transformar essa operação em um método
                    // teste para ver se os dados estão incluindo corretamente
                    System.out.println("Produto incluído com sucesso! ");
                    System.out.println(produto.nome + " || " + produto.preco + " || " + produto.qtdEstoque + " || " + produto.categoria);


                    scDados.close();

                case 2:
                    break;
            }

        }
    }
}
