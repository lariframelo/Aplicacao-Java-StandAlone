package main;

import java.text.ParseException;
import java.util.Scanner;

//aplicação em si
public class application {

    public static void main(String[] args) throws ParseException {

        CrudMain crudMain = new CrudMain();
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 5) {
            crudMain.listaMetodos();
            opcao = scanner.nextInt();
            crudMain.executeMetodo(opcao);

        }


    }
}