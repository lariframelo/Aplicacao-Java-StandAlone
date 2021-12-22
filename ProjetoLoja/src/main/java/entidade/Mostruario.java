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
        private String preco;
        private String qtdEstoque;



        public Mostruario(String codigo, String codigo_de_barras, String serie, String nome, String descricao, String categoria, String valor_bruto, String impostos, String data_de_fabricacao, String data_de_validade, String cor, String material, String preco, String qtdEstoque) {
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
                this.preco = preco;
                this.qtdEstoque = qtdEstoque;
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
        public String getPreco() {
                return preco;
        }

        public void setPreco(String preco) {
                this.preco = preco;
        }

        public String calculaPreco(String valor_bruto, String impostos) {
                if (preco.isEmpty()) {
                        Double vb = Double.parseDouble(valor_bruto);
                        Double imp = Double.parseDouble(impostos);
                        Double percent = ((vb + imp) * 40) / 100;
                        Double precoD = vb + imp + percent;
                        return preco = Double.toString(precoD);

                } else {
                        return preco = "0";
        }
        }
        public String getQtdEstoque() {
                return qtdEstoque;
        }

        public void setQtdEstoque(String qtdEstoque) {
                this.qtdEstoque = qtdEstoque;
        }


        @Override
        public String toString() {

                return "Product [codigo: " + codigo + ", codigo de barras: "+ codigo_de_barras  + ", serie:" + serie + ", nome:" + nome +
                        ", descrição:" + descricao + ", categoria: " + categoria + ",valor_bruto" + valor_bruto + ",impostos" + impostos +
                        ", data de fabricação: " + data_de_fabricacao + ",data de validade " + data_de_validade + ", cor:" + cor + ",material:"
                        +material + ", preço: " + preco +  "]";
        }
}
