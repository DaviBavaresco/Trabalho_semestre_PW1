package fretes;

import pessoas.Cliente;
import util.Situacao;
import util.Validador;

import java.util.Set;
import java.util.TreeSet;

public class Frete implements Validador {
    private Cliente cliente;
    Set<ItemFrete> itens = new TreeSet<>();
    private double valor;
    private String cidadeOrigem;
    private String cidadeDestino;
    private double pesoTotal;
    private Situacao tipo;

    public Frete(Cliente cliente, double valor, String cidadeOrigem, String cidadeDestino,Set<ItemFrete> itens) {
        this.cliente = cliente;
        itens = new TreeSet<>();
        this.valor = valor;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.tipo=Situacao.EM_ANDAMENTO;

    }



    public Frete() {
    }
    public void cancelar(){
        this.tipo = Situacao.CANCELADA;
    }
    public void encerrada(){
        this.tipo = Situacao.ENCERRADA;
    }
    @Override
    public boolean validarPeso() {
        if(this.getPesoTotal()>=100 || this.getPesoTotal()<=1){
            return false;
        }else
        return true;
    }
    public double getPesoTotal(){
        double peso=0;
        for(ItemFrete item: itens){
            peso+= item.getPeso();
        }

        return peso;
    }
    public void adicionarItem(ItemFrete item){
        itens.add(item);
    }
    public boolean Situacao(){
        if(validarPeso()==true){
            return true;
        }else
            this.tipo=Situacao.CANCELADA;
            return false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<ItemFrete> getItens() {
        return itens;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public Situacao getTipo() {
        return tipo;
    }

    public void setTipo(Situacao tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Frete{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", valor=" + valor +
                ", cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", pesoTotal=" + getPesoTotal() +
                ", tipo=" + tipo +
                '}';
    }
}
