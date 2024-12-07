import javax.swing.JOptionPane;

public class ExemploEstruturaCondicionalOu {
    public static void main(String[] args) {
        String jogo = JOptionPane.showInputDialog("Digite o nome do jogo");

        // equals é utilizado para comparar se a string é exatamente igual a outra string, verificando letras maiúsculas e minúsculas
        // equalsIgnoreCase é utilizado para comparar se string é igual, não verificando as letras maiúsculas e minúsculas

        if (jogo.equalsIgnoreCase("Stalker") || jogo.equalsIgnoreCase("GTA VI")) {
            JOptionPane.showMessageDialog(null, "Jogo do ano");
        } else {
            JOptionPane.showMessageDialog(null, "Não é o jogo do ano");
        }
        // STALKER
        // StalkeR
        // GTA Vi
        /*
         * Operador Lógico Ou em java é ||
         * Tabela Verdade
         *  V ou V => 
         *  V ou F => 
         *  F ou V => 
         *  F ou F => 
         */
    }
}
