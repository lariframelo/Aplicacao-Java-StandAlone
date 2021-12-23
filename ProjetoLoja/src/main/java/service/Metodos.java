package service;


import entidade.Mostruario;

import java.io.*;
import java.util.*;

public class Metodos {
public static String pathPrincipal =  "\\..mostruario_principal.csv";
public static String pathImport = "\\..mostruario_fabrica.csv";

    List<Mostruario> m = new ArrayList<>();
    Mostruario mostruario = new Mostruario();
    public static void importarCsv(String path) {

        List<Mostruario> products = new ArrayList<Mostruario>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathImport))) {

            String line = br.readLine();
            while (line != null) {

                String[] vect = line.split(",");
                String codigo = vect[0];
                String codigo_de_barras = vect[1];
                String serie = vect[2];
                String nome = vect[3];
                String descricao = vect[4];
                String categoria = vect[5];
                String valor_bruto = vect[6];
                String impostos = vect[7];
                String data_de_fabricacao = vect[8];
                String data_de_validade = vect[9];
                String cor = vect[10];
                String material = vect[11];


                Mostruario m = new Mostruario(codigo, codigo_de_barras, serie, nome, descricao, categoria, valor_bruto, impostos,
                        data_de_fabricacao, data_de_validade, cor, material);

                products.add(m);

                line = br.readLine();
                exportarCsv(m);

            }

            System.out.println("Products:");
            for (Mostruario m: products) {
                System.out.println(m);
            }

        }
        catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    public static void chamarImport() {
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.print("Digite o local do arquivo: ");
        path = sc.nextLine();
        importarCsv(path);

    }
    public static void importarCsvPrincipal() {

        List<Mostruario> products = new ArrayList<Mostruario>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathPrincipal))) {

            String line = br.readLine();
            while(line != null) {

                String[] vect = line.split(",");
                String codigo = vect[0];
                String codigo_de_barras = vect[1];
                String serie = vect[2];
                String nome = vect[3];
                String descricao = vect[4];
                String categoria = vect[5];
                String valor_bruto = vect[6];
                String impostos = vect[7];
                String data_de_fabricacao = vect[8];
                String data_de_validade = vect[9];
                String cor = vect[10];
                String material = vect[11];

                Mostruario m = new Mostruario(codigo,codigo_de_barras,serie,nome,descricao,categoria,valor_bruto,impostos,
                        data_de_fabricacao,data_de_validade,cor,material);
                products.add(m);

                line = br.readLine();

            }
            System.out.println("Products:");
            for (Mostruario m: products) {
                System.out.println(m);
            }

        }
        catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    public static void exportarCsv(Mostruario m) {
        String path = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\desafio\\desafio\\mostruario_principal.csv";
        List<Mostruario> mostruarioList = new ArrayList<Mostruario>();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {


                bw.write(new StringBuilder().append(m.getCodigo()).append(",").append(m.getCodigo_de_barras()).append(",").append(m.getSerie()).append(",").append(m.getNome()).append(",").append(m.getDescricao()).append(",").append(m.getCategoria()).append(",")
                        .append(m.getValor_bruto()).append(",").append(m.getImpostos()).append(",")
                        .append(m.getData_de_fabricacao()).append(",").append(m.getData_de_validade()).append(",").append(m.getCor())
                        .append(",").append(m.getMaterial()).append(",").append(",").toString());
                bw.newLine();


        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void cadastraProduto() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Mostruario> mostruarioList = new ArrayList<>();

        System.out.println("Cadastrar Produto: ");
        System.out.println("--------------------");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        //System.out.print("Preço: ");
        //String preco = sc.nextLine();
        //System.out.print("Quantidade: ");
        //String qtdEstoque = sc.nextLine();
        System.out.print("Categoria: ");
        String categoria = sc.nextLine();


        String codigo = "0";
        String codigo_de_barras = "0";
        String serie = "0";
        String descricao = "0";
        String valor_bruto = "0";
        String impostos = "0";
        String data_de_fabricacao = "0";
        String data_de_validade = "0";
        String cor = "0";
        String material = "0";
        System.out.println("[1] CADASTRAR PRODUTO");
        System.out.println("[2] CANCELAR E VOLTAR AO MENU");
        int opcao = sc.nextInt();

            switch (opcao) {
                case 1: Mostruario m = new Mostruario(codigo,codigo_de_barras,serie,nome,descricao,categoria,
                        valor_bruto,impostos,data_de_fabricacao,data_de_validade,cor,material);
                    mostruarioList.add(m);
                    exportarCsv(m);
                    System.out.println("Produto cadastrado com sucesso !");
                    break;

                case 2:


                    }
            }

    public static void excluirProdutos() {
        importarCsvPrincipal();
        List<Object> mlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        imprimirListaComPosicao(mlist);
        System.out.println("Digite o nome do produto que deseja excluir (completo)");
        String nome = sc.nextLine();
        mlist.remove(pesquisarNomesIguais(nome));

        }




    public static  void listarProduto(List<Mostruario> mlist) {
        importarCsvPrincipal();
        List<Mostruario> m = new ArrayList<>();
        int i, n = m.size();
        for (i=0; i<n; i++) {
            System.out.printf("Posição\n", i, m.get(i));
            }
        }


        public static int pesquisarNomesIguais(String nome) {
            List<Mostruario> mlist = new ArrayList<>();
            int getIndex = mlist.indexOf(nome);
            return getIndex;

            }

public static void imprimirListaComPosicao (List <Object> m ) {

    for(int i = 0; i<m.size(); i++){
        System.out.println("posicao " + (i+1) + " = " + m );

    }
}






}



