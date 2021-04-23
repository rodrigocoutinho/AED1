import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Produto {

    private String nome;
    private Double preco;
    private Integer quantidade;
    private Integer id;

    protected Produto() {
    }

    protected Produto(Integer id, String nome, Integer quantidade, Double preco) {
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

    public double getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void cadastrarProduto() {

        do {
            int ident = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto que deseja cadastrar:"));

            String name = JOptionPane.showInputDialog("Informe o nome do produto:");

            int quantity = Integer.parseInt(JOptionPane
                    .showInputDialog("Informe a quantidade inicial de produtos que serão adicionados ao estoque"));
            double price = Double
                    .parseDouble(JOptionPane.showInputDialog("Informe o preço inicial do produto que será adicionado"));
            listaProdutos.add(new Produto(ident, name, quantity, price));

            resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo produto?");

        } while (resposta == JOptionPane.YES_OPTION);

        menu.iniciarMenu();

    }

}
