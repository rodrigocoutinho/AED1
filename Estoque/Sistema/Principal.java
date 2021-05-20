import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    static int resposta;
    
    static int iniciarMenu(){


            JOptionPane.showMessageDialog(null,
                "O que você deseja fazer?\n\n\n1 - Cadastrar novo produto\n\n2 - Excluir produto\n\n3 - Inserir quantidade ao estoque\n\n4- Remover quantidade do estoque\n\n5 - Exibir todos os produtos em estoque\n\n6 - Cadastrar fornecedor\n\n7 - Alterar dados de um fornecedor\n\n8 - Excluir fornecedor\n\n9 - Solicitar produto\n\n0 - Sair");

                
                resposta = Integer.parseInt(JOptionPane.showInputDialog(""));
                
                return resposta;   
    }

    public static void main(String[] args){

        List<Produto> listaProdutos = new ArrayList<>();

        Produto produto = new Produto();
        Produto verifica;

        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao seu sistema de controle de estoque.");


        do{ 

            iniciarMenu();
            
            switch(resposta){

                case 0:

                    JOptionPane.showMessageDialog(null, "Tudo bem, até breve!!");
                    break;

                
                case 1:

                    int id = 0; 

                    do{
                        do {
                            int aux = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto que deseja cadastrar:"));
                            verifica = listaProdutos.stream().filter(x -> x.getId() == aux).findFirst().orElse(null);
            
                            if (verifica == null) {
                                id = aux;
                            }else
                                JOptionPane.showMessageDialog(null, "O ID informado já existe");
                    
                        } while (verifica != null);

                        String nome = JOptionPane.showInputDialog("Informe o nome do produto:");
                        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade inicial de produtos que serão adicionados ao estoque"));
                        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço inicial do produto que será adicionado"));

                        Produto prod = produto.cadastrarProduto(id, nome, quantidade, preco);

                        listaProdutos.add(prod);

                        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

                        resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar um novo produto?");

                    }while(resposta == JOptionPane.YES_OPTION);

                    break;
                
                
                case 2:

                    do{
                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto que deseja excluir:"));
                        verifica = listaProdutos.stream().filter(x -> x.getId() == aux).findFirst().orElse(null);

                        if (verifica == null){

                            JOptionPane.showMessageDialog(null, "O ID informado não existe");
                            
                        }else{

                            listaProdutos.removeIf(x -> x.getId() == aux);
                            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                        }
                            
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir um novo produto?");

                    }while(resposta == JOptionPane.YES_OPTION);

                    break;

                    
                    

                case 5:

                    Collections.sort(listaProdutos);
                    for (Produto produtos : listaProdutos) {
                        JOptionPane.showMessageDialog(null, "Lista de Produtos" + "\n\n" + produtos);
                    }
                    break;


                default:
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                        break;
                    

                    
                
            }

        }while(resposta != 0);

    }

}