package entidade;

import java.util.Date;

public class Mostruario {

        private String codigo;
        private String codigo_de_barras;
        private String serie;
        private String nome;
        private String descricao;
        private String categoria;
        private String valor_bruto;
        private String impostos;
        private String data_de_fabricacao;
        private String data_de_validade;
        private String cor;
        private String material;



        public Mostruario(String codigo, String codigo_de_barras, String serie, String nome, String descricao, String categoria, String valor_bruto, String impostos, String data_de_fabricacao, String data_de_validade, String cor, String material) {
                this.codigo = codigo;
                this.codigo_de_barras = codigo_de_barras;
                this.serie = serie;
                this.nome = nome;
                this.descricao = descricao;
                this.categoria = categoria;
                this.valor_bruto = valor_bruto;
                this.impostos = impostos;
                this.data_de_fabricacao = data_de_fabricacao;
                this.data_de_validade = data_de_validade;
                this.cor = cor;
                this.material = material;

        }

        public Mostruario(String nome, String preco, String qtdEstoque, String categoria) {

        }

        public String getCodigo() {
                return codigo;
        }

        public void setCodigo(String codigo) {
                this.codigo = codigo;
        }

        public String getCodigo_de_barras() {
                return codigo_de_barras;
        }

        public void setCodigo_de_barras(String codigo_de_barras) {
                this.codigo_de_barras = codigo_de_barras;
        }

        public String getSerie() {
                return serie;
        }

        public void setSerie(String serie) {
                this.serie = serie;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public String getCategoria() {
                return categoria;
        }

        public void setCategoria(String categoria) {
                this.categoria = categoria;
        }

        public String getValor_bruto() {
                return valor_bruto;
        }

        public void setValor_bruto(String valor_bruto) {
                this.valor_bruto = valor_bruto;
        }

        public String getImpostos() {
                return impostos;
        }

        public void setImpostos(String impostos) {
                this.impostos = impostos;
        }

        public String getData_de_fabricacao() {
                return data_de_fabricacao;
        }

        public void setData_de_fabricacão(String data_de_fabricacão) {
                this.data_de_fabricacao = data_de_fabricacao;
        }

        public String getData_de_validade() {
                return data_de_validade;
        }

        public void setData_de_validade(String data_de_validade) {
                this.data_de_validade = data_de_validade;
        }

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public String getMaterial() {
                return material;
        }

        public void setMaterial(String material) {
                this.material = material;
        }
        /*
        public String getPreco(String vb, String imp) {
                double valorB = Integer.parseInt(getImpostos());
                double impostos = Integer.parseInt(getImpostos());
                double gasto = valorB + impostos;
                double persent = (gasto/100)*45;
                double precototal = gasto + persent;
                String preco = Double.toString(precototal);
                return preco;
        }

         */
        public String qtdDefeault() {
                String qtd = "1";
                return qtd;

        }


        /*
        public double preco() {
                double custo = valor_bruto + impostos;
                double persent = (custo/100) * 45;
                double precoFinal = custo + persent;

                return precoFinal;
        }


         */

}