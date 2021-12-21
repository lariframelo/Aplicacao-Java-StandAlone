package entidade;

import java.util.Date;

public class Mostruario {

        long codigo;
        long codigo_de_barras;
        long serie;
        String nome;
        String descricao;
        String categoria;
        Double valor_bruto;
        Double impostos;
        String data_de_fabricacao;
        String data_de_validade;
        String cor;
        String material;

        public Mostruario(long codigo, long codigo_de_barras, long serie, String nome, String descricao, String categoria, Double valor_bruto, Double impostos, String data_de_fabricacao, String data_de_validade, String cor, String material) {
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

        public long getCodigo() {
                return codigo;
        }

        public void setCodigo(long codigo) {
                this.codigo = codigo;
        }

        public long getCodigo_de_barras() {
                return codigo_de_barras;
        }

        public void setCodigo_de_barras(long codigo_de_barras) {
                this.codigo_de_barras = codigo_de_barras;
        }

        public long getSerie() {
                return serie;
        }

        public void setSerie(long serie) {
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

        public Double getValor_bruto() {
                return valor_bruto;
        }

        public void setValor_bruto(Double valor_bruto) {
                this.valor_bruto = valor_bruto;
        }

        public Double getImpostos() {
                return impostos;
        }

        public void setImpostos(Double impostos) {
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

        @Override
        public String toString() {
                return "Product [codigo: " + codigo + ", codigo de barras: "+ codigo_de_barras  + ", serie:" + serie + ", nome:" + nome +
                        ", descrição:" + descricao + ", categoria: " + categoria + ",valor_bruto" + valor_bruto + ",impostos" + impostos +
                        ", data de fabricação: " + data_de_fabricacao + ",data de validade " + data_de_validade + ", cor:" + cor + ",material:"
                        +material + "]";
        }
}
