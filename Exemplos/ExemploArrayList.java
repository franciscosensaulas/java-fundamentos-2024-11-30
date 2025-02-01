import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaNomes();
    }

    private static void exemploListaNomes() {
        // String[] nomes = new String[4];

        // É uma lista "dinâmica" que permite adicionar, remover, atualizar
        // "Aumentando" e "diminuíndo" o tamanho da lista
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando itens na lista de nomes
        nomes.add("Charles");
        nomes.add("Maria");
        nomes.add("Cleiton");
        nomes.add("Francisco");

        // Alterar 'Cleiton' para 'Kleiton'
        nomes.set(2, "Kleiton");

        // Pegar o Kletion da lista e armazenar em uma variável
        String nomeTerceiraPosicao = nomes.get(2);

        // Remover o Francisco da lista
        nomes.remove("Francisco"); // Estava na posição 3
        nomes.add("NomeParaApagar"); // Adicionado na posição

        // Remover o elemento pela posição
        nomes.remove(3); // Removerá NomeParaApagar

        // Obter o tamanho da lista
        int tamanhoLista = nomes.size();

        // Apresentar todos os nomes
        JOptionPane.showMessageDialog(null,
                "Nomes: " +
                        "\nPrimeiro nome: " + nomes.get(0) +
                        "\nSegundo nome: " + nomes.get(1) +
                        "\nTerceiro nome: " + nomes.get(2) +
                        "Tamanho da lista de nomes: " + tamanhoLista);
    }
    // Criar o método exercicioNumeros
    // Criar ArrayList de Integer
    // Adicionar os números na lista: 10, 43, 20, 13
    // Remover o número 43
    // Apresentar o tamanho da lista
    // Apresentar os números da lista
    // Adicionar os números 4, 21, 22, 32
    // Alterar o número 13 para 131
    // Somar todos os números
    // Calcular a média dos números
    // Apresentar a soma e a média dos números
}
