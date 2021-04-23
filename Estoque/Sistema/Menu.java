
//public class Menu {
import javax.swing.JOptionPane;

public class Menu {

    protected Menu() {
    }

    protected void iniciarMenu() {

        int resposta;
        Produto produto = new Produto();

        JOptionPane.showMessageDialog(null,
                "O que você deseja fazer?\n\n\n1 - Cadastrar produto\n\n2 - Excluir produto\n\n3 - Adicionar produto ao estoque\n\n4- Remover produto do estoque\n\n5 - Exibir todos os produtos em estoque\n\n6 - Exibir solicitações pendentes\n\n7 - Atender solicitação de produto\n\n8 - Cadastrar fornecedor\n\n9 - Alterar dados de um fornecedor\n\n10 - Excluir fornecedor\n\n11 - Solicitar produto\n\n0 - Sair");

        resposta = Integer.parseInt(JOptionPane.showInputDialog(""));

        switch (resposta) {

        case 0:
            JOptionPane.showMessageDialog(null, "Tudo bem, até breve!!");
            break;

        case 1:
            produto.cadastrarProduto();
            break;

        default:
            JOptionPane.showMessageDialog(null, "Valor invalido");
            iniciarMenu();

        }

    }

}
