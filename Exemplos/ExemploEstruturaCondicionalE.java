import javax.swing.JOptionPane;

public class ExemploEstruturaCondicionalE {
    public static void main(String[] args){
        String email = JOptionPane.showInputDialog("Digite o seu email");
        String senha = JOptionPane.showInputDialog("Digite a senha");

        if (email.equals("batatinha@gmail.com") && senha.equals("admin")){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "E-mail inválido");
        }

        // Operador Lógico E em java é  &&
        // Tabela verdade
        // V e V => V
        // V e F => F
        // F e V => F
        // F e F => F
    }
}
