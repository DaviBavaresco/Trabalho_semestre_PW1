package fretes;

import pessoas.Cliente;
import util.Validador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Final {
    public static void main(String[] args) {
        List<Frete> fretes = new ArrayList<Frete>();

        while(true){
            switch(montaMenu()){
                case 1:
                    Cliente c1 = new Cliente(JOptionPane.showInputDialog("Qual o nome do cliente? "),
                            JOptionPane.showInputDialog("Qual o endereco do cliente? "),
                            JOptionPane.showInputDialog("Qual o telefone do cliente? "),
                            JOptionPane.showInputDialog("Qual o CPF do cliente? "));
                    int quantidade=Integer.parseInt(JOptionPane.showInputDialog("São quantos itens que vão no frete? "));
                    Set<ItemFrete> itens=new TreeSet<>();
                    for(int i=0;i<quantidade;i++){
                        itens.add(new ItemFrete(JOptionPane.showInputDialog("Qual a descrição do item? "),
                                Double.parseDouble(JOptionPane.showInputDialog("Qual o peso do item? "))));
                    }
                    fretes.add(new Frete(c1,Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do frete: ")),
                            JOptionPane.showInputDialog("Qual a cidade de origem? "),
                            JOptionPane.showInputDialog("Qual o destino? "),itens));
                    break;

                case 2:
                    boolean flag=false;
                    if(fretes!=null && !fretes.isEmpty()){
                        String pesqNome=JOptionPane.showInputDialog("Qual o nome do cliente para pesquisa? ");
                        for(Frete frete: fretes){
                            if(frete!=null && frete.getCliente().getNome().equals(pesqNome)){
                                JOptionPane.showMessageDialog(null,"Frete: "+frete.toString());
                                flag=true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Frete não existe");
                    break;

                case 3:
                    flag=false;
                    if(fretes!=null && !fretes.isEmpty()){
                        String pesqCpf=JOptionPane.showInputDialog("Qual o CPF do cliente para pesquisa? ");
                        for(Frete frete: fretes){
                            if(frete!=null && frete.getCliente().getCpf().equals(pesqCpf)){
                                JOptionPane.showMessageDialog(null,"Frete: "+frete.toString());
                                flag=true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Frete não existe");
                    break;

                case 4:
                    flag=false;
                    if(fretes!=null && !fretes.isEmpty()){
                        String pesqOr=JOptionPane.showInputDialog("Qual a cidade de origem para pesquisa? ");
                        String pesqDes=JOptionPane.showInputDialog("Qual a cidade de destino para pesquisa? ");
                        for(Frete frete: fretes){
                            if(frete!=null && frete.getCidadeDestino().equals(pesqDes) && frete.getCidadeOrigem().equals(pesqOr)){
                                JOptionPane.showMessageDialog(null,"Frete: "+frete.toString());
                                flag=true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Frete não existe");
                    break;

                case 5:
                    for(Frete frete: fretes){
                        if(frete!=null){
                            JOptionPane.showMessageDialog(null,frete.toString());
                        }
                    }
                    break;

                case 6:
                    for(Frete frete: fretes){
                        if(frete!=null){
                            JOptionPane.showMessageDialog(null,frete.getCliente().getNome());
                        }
                    }
                    break;

                case 7:
                    System.exit(0);
                    break;

            }

        }

    }

public static int montaMenu(){
        String menu="1 – Cadastrar Frete\n"+
                     "2 – Pesquisar Frete usando o nome do cliente\n"+
                "3 – Pesquisar Frete usando CPF do Cliente\n"+
                "4 – Pesquisar Frete usando cidade de origem e destino\n"+
                "5 – Listar todos os Fretes\n"+
                "6 – Listar todos os Clientes cadastrados\n"+
                "7 – Sair \n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
}
}






