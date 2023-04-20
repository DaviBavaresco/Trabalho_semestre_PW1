package testes;

import fretes.Frete;
import fretes.ItemFrete;

import java.util.Iterator;
import java.util.TreeSet;

public class TesteFrete2 {
    public static void main(String[] args) {
        Frete f1=new Frete();
        TreeSet<ItemFrete>itens=new TreeSet<>();
        itens.add(new ItemFrete("Telefone",1));
        itens.add(new ItemFrete("Geladeira",100));
        Iterator var3 =itens.iterator();
        while(var3.hasNext()) {
            ItemFrete item = (ItemFrete)var3.next();
            System.out.println(item.toString());
        }
    }
}
