import javax.swing.JOptionPane;

public class ExemploVetor {
    public static void main(String[] args) {
        exemploVetorString();
    }

    private static void exemploVetorString(){
        // Criar um vetor de String
        String[] nomes = new String[4]; // Posições do vetor 0, 1, 2, 3
        
        // Adicionar nome no vetor de nomes
        nomes[0] = "Charles";
        nomes[1] = "Maria";
        nomes[2] = "Cleiton";
        nomes[3] = "Francisco";
        // nomes[4] = "Pedro"; // java.lang.ArrayIndexOutOfBoundsException (erro acontece quando tenta acessar uma posição que n existe)

        nomes[2] = "Kleiton";

        // Apresentar os nomes armazenados
        JOptionPane.showMessageDialog(null, 
            "Nomes:" +
            "\nPrimeiro nome: " + nomes[0] + 
            "\nSegundo nome: " + nomes[1] +
            "\nTerceiro nome: " + nomes[2] +
            "\nQuarto nome: " + nomes[3]
            // "\nQuinto nome: " + nomes[4]
        );
    }
    // Criar um método exercicioNumeros
    // Criar um vetor de 6 posições
    // Preencher o vetor com os números: 8, 52, 7, 3, 19 e 35
    // Alterar o número da terceira posição para 8
    // Somar todos os números
    // Apresentar todos os números e a soma

    // Criar um método exercicioNotas
    // Criar um vetor do tipo double com 4 posições, para armazenar as 4 notas do aluno
    // Solicitar as quatro notas armazenando nas quatro posições do vetor
    // Calcular a média das notas
    // Apresentar as notas e a média

}
