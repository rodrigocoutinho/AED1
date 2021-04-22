import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args){
       
        JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao seu sistema de controle de estoque.");

        Menu menu = new Menu();

        menu.iniciarMenu();
   
    }
}