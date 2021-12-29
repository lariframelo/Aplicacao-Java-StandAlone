
        package service;


        import entidade.Mostruario;
        import entidade.Product;
        import org.jetbrains.annotations.NotNull;

        import java.io.*;
        import java.util.*;

public class Metodos {
    public static String pathPrincipal = "\\..mostruario_principal.csv";
    public static String pathImport = "\\..mostruario_fabrica.csv";


    public static void importarCsv() {
        Scanner sc = new Scanner(System.in);
        List<Mostruario> list = new ArrayList<>();
        //System.out.print("Digite o local do arquivo:");
        String sourceFileStr = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\ProjetoLoja\\out\\mostruario_fabrica.csv";

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean sucess = new File(sourceFolderStr + "\\out\\").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {


            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String codigo = fields[0];
                String codigo_de_barras = fields[1];
                String serie = fields[2];
                String nome = fields[3];
                String descricao = fields[4];
                String categoria = fields[5];
                String valor_bruto = fields[6];
                String impostos = fields[7];
                String data_de_fabricacao = fields[8];
                String data_de_validade = fields[9];
                String cor = fields[10];
                String material = fields[11];

                list.add(new Mostruario(codigo, codigo_de_barras, serie, nome, descricao, categoria, valor_bruto, impostos,
                        data_de_fabricacao, data_de_validade, cor, material));
                itemCsv = br.readLine();


            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Mostruario m : list) {
                    bw.write(m.getNome() + ","
                            + m.getCategoria() + "," + m.qtdDefeault()
                    );
                    bw.newLine();
                }

                System.out.println(targetFileStr + "Incluído!");

            } catch (IOException e) {
                System.out.println("Error ao escrever arquivo:" + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo:" + e.getMessage());
        }

    }

    public static void cadastrarProduto() {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Cadastrar Produto: ");
        System.out.println("--------------------");
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        //System.out.print("Preço: ");
        //String preco = sc.nextLine();
        System.out.print("Quantidade: ");
        String qtdEstoque = sc.nextLine();
        System.out.print("Categoria: ");
        String categoria = sc.nextLine();

        System.out.println("[1] CADASTRAR PRODUTO");
        System.out.println("[2] CANCELAR E VOLTAR AO MENU");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                String sourceFileStr = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\ProjetoLoja\\out\\out\\sumary.csv";
                list.add(new Product(nome, qtdEstoque, categoria));
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFileStr, true))) {

                    for (Product p : list) {
                        bw.write(p.getNome() + ","
                                + p.getCategoria() + ","
                                + p.getQtdEstoque());
                        bw.newLine();
                        System.out.println("Produto cadastrado com sucesso !");
                    }
                } catch (IOException e) {
                    System.out.println("Erro ao escrever arquivo:" + e.getMessage());
                }

                break;

            case 2:
                break;

        }


    }

    public static void excluirProduto() {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        String sourceFileStr = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\ProjetoLoja\\out\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {


            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                String categoria = fields[1];
                String qtdEstoque = fields[2];


                list.add(new Product(nome, categoria, qtdEstoque));
                itemCsv = br.readLine();

            }

            for (Product p : list) {
                int i, n = list.size();
                for (i = 0; i < n; i++)
                    System.out.println("Posição " + i + list.get(i));
                System.out.printf("---------------------------------------");
                System.out.println("Escolha a posição do produto a ser excluído:");
                int escolha = sc.nextInt();
                int posicao = escolha;
                Product index = list.get(posicao);
                System.out.println("Excluir : " + index + " ?");
                //System.out.println("[1] EXCLUIR PRODUTO");
                //System.out.println("[2] CANCELAR E VOLTAR AO MENU");
                //int opcao = sc.nextInt();
                //list.remove(index);


            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFileStr))) {

                for (Product p : list) {
                    bw.write(p.getNome() + ","
                            + p.getCategoria() + "," + p.getQtdEstoque());
                    bw.newLine();
                }

                System.out.println("Excluído!");

            } catch (IOException e) {
                System.out.println("Error ao escrever arquivo:" + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo:" + e.getMessage());
        }

    }

    public static void editarProduto() {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        String sourceFileStr = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\ProjetoLoja\\out\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {


            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                String categoria = fields[1];
                String qtdEstoque = fields[2];


                list.add(new Product(nome, categoria, qtdEstoque));
                itemCsv = br.readLine();

            }

            for (Product p : list) {
                int i, n = list.size();
                for (i = 0; i < n; i++)
                    System.out.println("Posição " + i + list.get(i));
                System.out.printf("---------------------------------------");
                System.out.println("Escolha a posição do produto que deseja editar:");
                int escolha = sc.nextInt();
                int posicao = escolha;
                Product index = list.get(posicao);
                System.out.println("Editar : " + index + " ?");
                System.out.print("Novo Nome : ");
                p.setNome(sc.nextLine());
                sc.next();
                System.out.print("Nova categoria : ");
                p.setCategoria(sc.nextLine());
                sc.next();
                System.out.print("Nova quantidade : ");
                p.setQtdEstoque(sc.nextLine());

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFileStr))) {

                for (Product p : list) {
                    bw.write(p.getNome() + ","
                            + p.getCategoria() + "," + p.getQtdEstoque());
                    bw.newLine();
                }

                System.out.println("Excluído!");

            } catch (IOException e) {
                System.out.println("Error ao escrever arquivo:" + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo:" + e.getMessage());
        }

    }


    public static void listarProduto(@NotNull List<Product> list) {
        int i, n = list.size();
        for (i = 0; i < n; i++)
            System.out.println("Posição " + i + list.get(i));
        System.out.printf("---------------------------------------");
    }

    public static void removeProduct(List<Product> list) {
        for (Product p : list) {

            Scanner sc = new Scanner(System.in);
            int i, n = list.size();
            for (i = 0; i < n; i++)
                System.out.println("Posição " + i + list.get(i));
            System.out.printf("---------------------------------------");
            System.out.println("Escolha a posição do produto a ser excluído:");
            int escolha = sc.nextInt();
            int posicao = escolha;
            Product index = list.get(posicao);
            System.out.println("Excluir : " + index + " ?");
            //System.out.println("[1] EXCLUIR PRODUTO");
            //System.out.println("[2] CANCELAR E VOLTAR AO MENU");
            //int opcao = sc.nextInt();
            list.remove(index);
            sc.close();
        }
    }

    public static void listarCsv() {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        String sourceFileStr = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\ProjetoLoja\\out\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {


            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                String categoria = fields[1];
                String qtdEstoque = fields[2];


                list.add(new Product(nome, categoria, qtdEstoque));
                itemCsv = br.readLine();

            }

            for (Product p : list) {
                int i, n = list.size();
                for (i = 0; i < n; i++)
                    System.out.println("Posição " + i + list.get(i));
                System.out.printf("---------------------------------------");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
    public static void importarCsvPrincipal() {

        List<Mostruario> products = new ArrayList<Mostruario>();

        try (BufferedReader br = new BufferedReader(new FileReader("E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\desafio\\desafio\\mostruario_principal.csv"))) {

            String line = br.readLine();
            while(line != null) {

                String[] vect = line.split(",");
                String codigo = vect[0];
                String codigo_de_barras = vect[1];
                String serie = vect[2];
                String nome = vect[3];
                String descricao = vect[4];
                String categoria = vect[5];
                String valor_bruto = Integer.parseInt()vect[6];
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
    public static void rescreverCsv(Mostruario m) {
        String path = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\desafio\\desafio\\mostruario_principal.csv";
        List<Mostruario> mostruarioList = new ArrayList<Mostruario>();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {


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
        List<Mostruario> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

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
                System.out.println("Escolha o indice do produto a ser excluído:");
                int escolha = sc.nextInt();
                int indice = escolha -1 ;
                products.remove(indice);
                rescreverCsv(m);
            }




        }
        catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
        String path = "E:\\LARISSA TI\\Repositório GitHub\\Aplicacao-Java-StandAlone\\desafio\\desafio\\mostruario_principal.csv";
        List<Mostruario> mostruarioList = new ArrayList<Mostruario>();



    }




    public int  listarProduto(List<Mostruario> mlist) {
        importarCsvPrincipal();
        List<Mostruario> m = new ArrayList<>();
        int i = 0;
        for (i=0; i< m.size(); i++) {
            return i;
        }
        return i;
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



*/



