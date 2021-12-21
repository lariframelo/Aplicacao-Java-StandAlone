package main;

import service.Metodos;

import java.util.ArrayList;
import java.util.Scanner;

//aplicação em si
public class application {
    public static void main(String[] args) {

            CrudMain crudMain = new CrudMain();
            Scanner scanner = new Scanner(System.in);
            int opcao;


            while (1 > 0) {
                crudMain.listaMetodos();
                opcao = scanner.nextInt();
                crudMain.executeMetodo(opcao);
            }



    }
}