package service;


import entidade.Mostruario;

import java.io.*;
import java.util.*;

public class Metodos {


    public static void importarCsv() {
        String path = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\desafio\\desafio\\mostruario_fabrica.csv";
        List<Mostruario> products = new ArrayList<Mostruario>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

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
                String preco = vect[12];
                String qtdEstoque = vect[13];


                Mostruario m = new Mostruario(codigo,codigo_de_barras,serie,nome,descricao,categoria,valor_bruto,impostos,
                        data_de_fabricacao,data_de_validade,cor,material,preco,qtdEstoque);
                m.setPreco(m.calculaPreco(valor_bruto,impostos)); // método para calcular preço corrigido
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
                        .append(",").append(m.getMaterial()).append(",").append(m.getPreco()).append(",").append(m.getQtdEstoque()).toString());
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
        System.out.print("Preço: ");
        String preco = sc.nextLine();
        System.out.print("Quantidade: ");
        String qtdEstoque = sc.nextLine();
        System.out.println("Categoria: ");
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


        Mostruario m = new Mostruario(codigo,codigo_de_barras,serie,nome,descricao,categoria,
                valor_bruto,impostos,data_de_fabricacao,data_de_validade,cor,material,preco,qtdEstoque);
        mostruarioList.add(m);
        exportarCsv(m);


    }






}


