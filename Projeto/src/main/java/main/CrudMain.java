package main;

import Controller.ProductController;

public class CrudMain {
    ProductController controller = new ProductController();

    public void listaMetodos() {

        System.out.println(" Loja Online ");
        System.out.println("===================================");
        System.out.println("[1] - Adicionar novo produto ");
        System.out.println("[2] - Editar Produto ");
        System.out.println("[3] - Excluir Produto ");
        System.out.println("[4] - Importar Mostruário ");
        System.out.println("[5] - Sair ");
        System.out.print("Digite a opção para acessá-la: ");
       ;
    }

    // Aqui será o método a ser executado será escolhido
    // de acordo com a opção passada pelo teclado
    public void executeMetodo(int opcao) {

        switch (opcao) {
            case 1:
                controller.createProduto();
                break;
            case 2:
                controller.listaProdutos();
                controller.prepareUpdate();
                break;
            case 3:
                //aqui eu tenho que ler um arquivo csv
                break;
            case 4:
                controller.prepareDelete();
                break;
            case 5:
                System.out.println("Encerrado");
                System.exit(0);
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
