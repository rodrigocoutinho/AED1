import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/*
public class Menu {


    protected void iniciarMenu() {

        int resposta;
        //Produto produto = new Produto();
        List<Produto> lista = new ArrayList<>();

        JOptionPane.showMessageDialog(null,
                "O que você deseja fazer?\n\n\n1 - Cadastrar produto\n\n2 - Excluir produto\n\n3 - Adicionar produto ao estoque\n\n4- Remover produto do estoque\n\n5 - Exibir todos os produtos em estoque\n\n6 - Exibir solicitações pendentes\n\n7 - Atender solicitação de produto\n\n8 - Cadastrar fornecedor\n\n9 - Alterar dados de um fornecedor\n\n10 - Excluir fornecedor\n\n11 - Solicitar produto\n\n0 - Sair");

        resposta = Integer.parseInt(JOptionPane.showInputDialog(""));

        switch (resposta) {

        case 0:
            JOptionPane.showMessageDialog(null, "Tudo bem, até breve!!");
            break;

        case 1:


            Produto verifica;
            int ident = 0;

            do {

                do {
                    int aux = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe o ID do produto que deseja cadastrar:"));

                    verifica = lista.stream().filter(x -> x.getId() == aux).findFirst().orElse(null);

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

                lista.add(new Produto(ident, name, quantity, price));

                System.out.println(lista.size());
                for (Produto produtos : lista) {
                    JOptionPane.showMessageDialog(null, "Lista de Produtos" + "\n\n" + produtos);
                }
                System.out.println(lista.size());

                resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo produto?");
                System.out.println(lista.size());
            } while (resposta == JOptionPane.YES_OPTION);
            iniciarMenu();
            //produto.cadastrarProduto();
            break;
        
        case 2:
            
        case 3:

        case 4:

        case 5:
            System.out.println(lista.size());
            System.out.println("");
        for (int i=0; i<lista.size();i++) {
            System.out.println(lista.get(i).getNome());
            //JOptionPane.showMessageDialog(null, "Lista de Produtos" + "\n\n" + lista.get(i).toString());
        }
            iniciarMenu();
            break;

        default:
            JOptionPane.showMessageDialog(null, "Valor invalido");
            iniciarMenu();

        }

    }

}
*/