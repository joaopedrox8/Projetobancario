package model;
import java.time.LocalDate;
public class Despesa {

    private String descricao;
    private double valor;
    private LocalDate data;
    private String categoria;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setData(LocalDate data) {
    this.data = data;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public LocalDate getData() {
        return data;
    }
    public String getCategoria() {
        return categoria;
    }
    public Despesa(String descricao, double valor, LocalDate data,String categoria){
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

}



