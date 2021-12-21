package service;


import entidade.Mostruario;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Csv {

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
}

