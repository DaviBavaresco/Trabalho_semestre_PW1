package pessoas;

public class Cliente extends Pessoa {
    private String endereco;
    private String telefone;
    private String cpf;
    private static int numero = 0;

    public Cliente(String nome, String endereco, String telefone, String cpf) {
        super(nome);
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        numero++;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public static int getTotal(){
        return numero;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                ", Nome='" + getNome() + '\'' +
                "endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
