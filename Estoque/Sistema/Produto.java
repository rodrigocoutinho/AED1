import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private int id;

    protected Produto() {
    }

    protected Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    int resposta = 0;
    List<Produto> listaProdutos = new ArrayList<>();
    Menu menu = new Menu();

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

    public void cadastrarProduto() {

        Produto verifica;
        int ident = 0;

        do {
 
            do {
                int aux = Integer
                        .parseInt(JOptionPane.showInputDialog("Informe o ID do produto que deseja cadastrar:"));

                verifica = listaProdutos.stream().filter(x -> x.getId() == aux).findFirst().orElse(null);

                if (verifica == null) {
                    ident = aux;
                }else
                    JOptionPane.showMessageDialog(null, "O ID informado já existe");

        
            } while (verifica != null);

            String name = JOptionPane.showInputDialog("Informe o nome do produto:");

            int quantity = Integer.parseInt(JOptionPane
                    .showInputDialog("Informe a quantidade inicial de produtos que serão adicionados ao estoque"));
            double price = Double
                    .parseDouble(JOptionPane.showInputDialog("Informe o preço inicial do produto que será adicionado"));

            listaProdutos.add(new Produto(ident, name, quantity, price));

            
            for (Produto produtos : listaProdutos) {
            JOptionPane.showMessageDialog(null, "Lista de Produtos" + "\n\n" + produtos);
        }

            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo produto?");

        } while (resposta == JOptionPane.YES_OPTION);

        menu.iniciarMenu();

    }

    public void exibirProdutos() {

        for (Produto produtos : listaProdutos) {
            JOptionPane.showMessageDialog(null, "Lista de Produtos" + "\n\n" + produtos);
        }

        menu.iniciarMenu();
    }

}
