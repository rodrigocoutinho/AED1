package controleestoque;

import javax.swing.JOptionPane;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private int id;

    public Produto(int id, String nome, int quantidade, double preco){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto(){}

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getQuantidade(){
        return quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void cadastrarProduto(){

        JOptionPane.showMessageDialog(null,"Testando");
    }


}



