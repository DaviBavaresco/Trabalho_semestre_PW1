import pessoas.Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente c1= new Cliente("Davi","rua 123","5551","1234");
        Cliente c2= new Cliente("Davi","rua 123","5551","1234");
        Cliente c3= new Cliente("Davi","rua 123","5551","1234");
        Cliente c4= new Cliente("Davi","rua 123","5551","1234");

        int cont1= Cliente.getTotal();
        System.out.println(cont1);
    }
}