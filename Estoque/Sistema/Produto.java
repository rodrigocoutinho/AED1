import java.text.NumberFormat;

public class Produto implements Comparable<Produto> {

    private String nome;
    private Double preco;
    private Integer quantidade;
    private Integer id;

    protected Produto() {
    }

    protected Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "(" + getId() + ")" + " - " + getNome() + "\n\nValor do produto: "
                + NumberFormat.getCurrencyInstance().format(getPreco()) + "\n\nQuantidade em estoque: "
                + getQuantidade() + "\n\nValor total da mercadoria em estoque: "
                + NumberFormat.getCurrencyInstance().format(getPreco() * getQuantidade());
    }

    protected Produto cadastrarProduto(int id, String nome, int quantidade, double preco) {

        return new Produto(id, nome, quantidade, preco);
        
    }

    @Override
    public int compareTo(Produto prod2){

        return id.compareTo(prod2.getId());
    }

}


