package fretes;

public final class ItemFrete implements Comparable<ItemFrete>{
    private String descricao;
    private double peso;

    public ItemFrete(String descricao, double peso) {
        this.descricao = descricao;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String  toString() {
        return " Descricao= " + descricao +
                " Peso= " + peso ;
    }

    @Override
    public int compareTo(ItemFrete o) {
        return (int) (peso-o.peso);
    }
}
