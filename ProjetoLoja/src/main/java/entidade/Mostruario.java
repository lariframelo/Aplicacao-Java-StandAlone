package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mostruario {

        long código;
        long codigo_de_barras;
        long série;
        String nome;
        String descrição;
        String categoria;
        Double valor_bruto;
        Double impostos;
        Date data_de_fabricação;
        Date data_de_validade;
        String cor;
        String material;

        public long getCódigo() {
                return código;
        }

        public void setCódigo(long código) {
                this.código = código;
        }

        public long getCodigo_de_barras() {
                return codigo_de_barras;
        }

        public void setCodigo_de_barras(long codigo_de_barras) {
                this.codigo_de_barras = codigo_de_barras;
        }

        public long getSérie() {
                return série;
        }

        public void setSérie(long série) {
                this.série = série;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getDescrição() {
                return descrição;
        }

        public void setDescrição(String descrição) {
                this.descrição = descrição;
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

        public Date getData_de_fabricação() {
                return data_de_fabricação;
        }

        public void setData_de_fabricação(Date data_de_fabricação) {
                this.data_de_fabricação = data_de_fabricação;
        }

        public Date getData_de_validade() {
                return data_de_validade;
        }

        public void setData_de_validade(Date data_de_validade) {
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
}
