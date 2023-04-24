package testes;

import fretes.Frete;
import fretes.ItemFrete;
import pessoas.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TesteFinal {
    public static void main(String[] args) {
        Cliente c1= new Cliente("Davi","Rua 123","5551","123321");
        Set<ItemFrete> itens=new TreeSet<>();
        itens.add(new ItemFrete("telefone",1));
        itens.add(new ItemFrete("Geladeira",100));
        List<Frete> fretes=new ArrayList<>();
        //fretes.add(new Frete(c1,1500,"Viamao","POA",itens));
//        Frete f;
//        f=new Frete(c1,1,"Viamao","POA",itens);
//        fretes.add(f);
//        f=new Frete(c1,2,"Viamao","POA",itens);
//        fretes.add(f);

        Frete f1=new Frete(c1,3,"Viamao","POA",itens);
        fretes.add(f1);
        System.out.println(fretes.toString());
        if(f1.validarPeso()){
            fretes.add(f1);
        }else {
            System.out.println("erro");

        };
        System.out.println(fretes.toString());
        System.out.println("-----------------------------------------------------");
        itens.add(new ItemFrete("Geladeiraaaaaaaa",12));
        Frete f2=new Frete(c1,120,"Viamao","POA",itens);
        fretes.add(f2);
        //System.out.println(f1.getPesoTotal());
        System.out.println(fretes.size());
        System.out.println(fretes.toString());
    }
}
