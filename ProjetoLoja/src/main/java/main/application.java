package main;

import service.Metodos;

import java.util.ArrayList;
import java.util.Scanner;

//aplicação em si
public class application {
    public static void main(String[] args) {
        ArrayList<String> listaProduto = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(" Loja Online ");
            System.out.println("===================================");
            System.out.println("[1] - Adicionar novo produto ");
            System.out.println("[2] - Editar Produto ");
            System.out.println("[3] - Excluir Produto ");
            System.out.println("[4] - Importar Mostruário ");
            System.out.println("[5] - Sair ");
            System.out.print("Digite a opção para acessá-la: ");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    Metodos.incluirProduto(listaProduto);
                    break;
                case 2:
                    Metodos.alterarProduto(listaProduto);
                    break;
                case 3:
                    Metodos.excluir(listaProduto);
                    break;
                case 4:
                    Metodos.importar(listaProduto);
                    break;
                case 5:
                    System.out.println("Encerrado");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.printf("\n\n");

        } while (opcao != 0);




    }
}