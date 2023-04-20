package testes;

import fretes.Frete;
import fretes.ItemFrete;
import pessoas.Cliente;

import java.util.Set;
import java.util.TreeSet;

public class TesteFrete {
    public static void main(String[] args) {
    Cliente c1= new Cliente("Davi","rua 123","5551","1234");
    ItemFrete i1=new ItemFrete("Telefone",1);
    ItemFrete i2=new ItemFrete("Geladeira",100);
    //Frete f1=new Frete(c1,1500,"viamao","porto alegre");
    //f1.adicionarItem(i1);
    //f1.adicionarItem(i2);
    //System.out.println(f1.toString());
    //f1.encerrada();
    System.out.println("------------------------------------");
   // System.out.println(f1.toString());
    //System.out.println(f1.getPesoTotal());
    //System.out.println(f1.validarPeso());
    //System.out.println(f1.Situacao());
    System.out.println("------------------------------------");
    //System.out.println(f1.toString());

    }
}
