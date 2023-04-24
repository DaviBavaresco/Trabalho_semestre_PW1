package util;

public enum Situacao {
    EM_ANDAMENTO("Em andamento",1),
    CANCELADO("Cancelado",2),
    ENCERRADO("Encerrado",3);
    private String descricao;
    private int id;

    Situacao(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getId(){
        return id;
    }
}
