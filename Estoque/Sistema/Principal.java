import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    static int resposta;

    static int iniciarMenu() {

        JOptionPane.showMessageDialog(null,
                "O que você deseja fazer?\n\n\n1 - Cadastrar novo produto\n\n2 - Excluir produto\n\n3 - Inserir quantidade ao estoque\n\n4- Remover quantidade do estoque\n\n5 - Exibir todos os produtos em estoque\n\n6 - Cadastrar fornecedor\n\n7 - Alterar dados de um fornecedor\n\n8 - Excluir fornecedor\n\n9 - Exibir lista de fornecedores\n\n0 - Sair");

        resposta = Integer.parseInt(JOptionPane.showInputDialog(""));

        return resposta;
    }

    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();
        List<Fornecedor> listaFornecedores = new ArrayList<>();

        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();
        Produto verifica;
        Fornecedor verificaFornecedor;

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao seu sistema de controle de estoque.");

        do {

            iniciarMenu();

            switch (resposta) {

                case 0:

                    JOptionPane.showMessageDialog(null, "Tudo bem, até breve!!");
                    break;

                case 1:

                    int id = 0;

                    do {
                        do {
                            int aux = Integer.parseInt(
                                    JOptionPane.showInputDialog("Informe o ID do produto que deseja cadastrar:"));
                            verifica = listaProdutos.stream().filter(x -> x.getId() == aux).findFirst().orElse(null);

                            if (verifica == null) {
                                id = aux;
                            } else
                                JOptionPane.showMessageDialog(null, "O ID informado já existe");

                        } while (verifica != null);

                        String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
                        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe a quantidade inicial de produtos que serão adicionados ao estoque"));
                        double preco = Double.parseDouble(
                                JOptionPane.showInputDialog("Informe o preço inicial do produto que será adicionado"));

                        Produto prod = produto.cadastrarProduto(id, nome, quantidade, preco);

                        listaProdutos.add(prod);

                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

                        resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo produto?");

                    } while (resposta == JOptionPane.YES_OPTION);

                    break;

                case 2:

                    do {
                        int aux = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o ID do produto que deseja excluir:"));
                        verifica = listaProdutos.stream().filter(x -> x.getId() == aux).findFirst().orElse(null);

                        if (verifica == null) {

                            JOptionPane.showMessageDialog(null, "O ID informado não existe");

                        } else {

                            listaProdutos.removeIf(x -> x.getId() == aux);
                            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                        }

                        resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir um novo produto?");

                    } while (resposta == JOptionPane.YES_OPTION);

                    break;

                case 5:

                    Collections.sort(listaProdutos);
                    for (Produto produtos : listaProdutos) {
                        JOptionPane.showMessageDialog(null, "Lista de Produtos" + "\n\n" + produtos);
                    }
                    break;

                case 6:

                    int idFornecedor = 0;
                    String observacoes;

                    do {
                        do {
                            int aux = Integer.parseInt(
                                    JOptionPane.showInputDialog("Informe o ID do fornecedor que deseja cadastrar:"));
                            verificaFornecedor = listaFornecedores.stream().filter(x -> x.getId() == aux).findFirst()
                                    .orElse(null);

                            if (verificaFornecedor == null) {
                                idFornecedor = aux;
                            } else
                                JOptionPane.showMessageDialog(null, "O ID informado já existe");

                        } while (verificaFornecedor != null);

                        String cnpj = JOptionPane.showInputDialog("Informe o CNPJ do fornecedor:");
                        String razaoSocial = JOptionPane.showInputDialog("Informe a razão social:");
                        String telefone = JOptionPane.showInputDialog("Informe o telefone para contato:");
                        String email = JOptionPane.showInputDialog("Informe o e-mail do fornecedor:");

                        resposta = JOptionPane.showConfirmDialog(null,
                                "Deseja inserir alguma informação sobre o fornecedor?");

                        if (resposta == JOptionPane.YES_OPTION) {

                            observacoes = JOptionPane.showInputDialog("Insira uma observação sobre esse fornecedor:");

                        } else {

                            observacoes = "Não há informações sobre esse fornecedor! ";
                        }

                        Fornecedor fornecedores = fornecedor.cadastrarFornecedor(idFornecedor, cnpj, razaoSocial,
                                telefone, email, observacoes);

                        listaFornecedores.add(fornecedores);

                        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");

                        resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo Fornecedor?");

                    } while (resposta == JOptionPane.YES_OPTION);

                    break;

                case 8:

                    do {
                        int aux = Integer.parseInt(
                                JOptionPane.showInputDialog("Informe o ID do fornecedor que deseja excluir:"));
                        verificaFornecedor = listaFornecedores.stream().filter(x -> x.getId() == aux).findFirst()
                                .orElse(null);

                        if (verificaFornecedor == null) {

                            JOptionPane.showMessageDialog(null, "O ID informado não existe");

                        } else {

                            listaFornecedores.removeIf(x -> x.getId() == aux);
                            JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso!");
                        }

                        resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir um novo fornecedor?");

                    } while (resposta == JOptionPane.YES_OPTION);

                    break;

                case 9:

                    Collections.sort(listaFornecedores);
                    for (Fornecedor fornecedores : listaFornecedores) {
                        JOptionPane.showMessageDialog(null, "Lista de Fornecedores" + "\n\n" + fornecedores);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;

            }

        } while (resposta != 0);

    }

}