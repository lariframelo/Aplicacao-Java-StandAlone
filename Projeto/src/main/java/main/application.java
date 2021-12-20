package main;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        CrudMain crudMain = new CrudMain();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // MUITA ATENÇÃO NESTE BLOCO
        while (1 > 0) {
            crudMain.listaMetodos();
            opcao = scanner.nextInt();
            crudMain.executeMetodo(opcao);


        }
    }
}
