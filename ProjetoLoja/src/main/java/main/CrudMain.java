package main;

import service.Metodos;

import java.text.ParseException;

//construção do menu
public class CrudMain {

    int opcao;


    public void listaMetodos() {

        System.out.println(" Loja Online ");
        System.out.println("===================================");
        System.out.println("[1] - Adicionar novo produto ");
        System.out.println("[2] - Editar Produto ");
        System.out.println("[3] - Excluir Produto ");
        System.out.println("[4] - Importar Mostruário ");
        System.out.println("[5] - Listar Produto  ");
        System.out.println("[6] - Sair ");
        System.out.print("Digite a opção para acessá-la: ");
        ;
    }

    // Aqui será o método a ser executado será escolhido
    // de acordo com a opção passada pelo teclado
    public void executeMetodo(int opcao) throws ParseException {

        switch (opcao) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                Metodos.importarCsv();
                break;
            case 5:

                break;
            case 6:
                break;
            default:
                System.out.println("Opção inválida");
                break;

            }


    }

}
