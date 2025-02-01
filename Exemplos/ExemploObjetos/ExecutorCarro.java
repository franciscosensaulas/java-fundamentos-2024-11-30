package ExemploObjetos;

import javax.swing.JOptionPane;

public class ExecutorCarro {
    public static void main(String[] args) {
        // Instanciar(new) um objeto
        Carro x6 = new Carro();
        // Definindo valor para os atributos do objeto do carro
        x6.modelo = "X6";
        x6.marca = "BMW";
        x6.preco = 1_000_000.00;
        x6.anoLancamento = 2024;
        x6.cor = "Preto";

        Carro fusca = new Carro();
        fusca.modelo = "Fusca";
        fusca.marca = "VW";
        fusca.preco = 13000;
        fusca.anoLancamento = 1972;
        fusca.cor = "Ferrugem";

        Carro uno = new Carro();
        uno.modelo = "Uno com escada";
        uno.marca = "Fiat";
        uno.preco = 15000;
        uno.cor = "Prata";
        uno.anoLancamento = 2005;

        JOptionPane.showMessageDialog(
                null,
                "Modelo: " + x6.modelo +
                        "\nMarca: " + x6.marca +
                        "\nPreço: " + x6.preco +
                        "\nCor: " + x6.cor +
                        "\nAno de Lançamento: " + x6.anoLancamento
                        + "\n" +
                        "Modelo: " + fusca.modelo +
                        "\nMarca: " + fusca.marca +
                        "\nPreço: " + fusca.preco +
                        "\nCor: " + fusca.cor +
                        "\nAno de Lançamento: " + fusca.anoLancamento +
                        "\n" +
                        "Modelo: " + uno.modelo +
                        "\nMarca: " + uno.marca +
                        "\nPreço: " + uno.preco +
                        "\nCor: " + uno.cor +
                        "\nAno de Lançamento: " + uno.anoLancamento);
    }
}
/*
    Criar uma classe chamada Funcionario.java dentro do pacote ExemploObjetos
    Adicionar na classe Funcionario os atributos:
        - nome
        - idade
        - peso
        - altura
        - cpf
    Criar classe ExecutorFuncionario.java dentro do pacote ExemploObjetos
    Adicionar na classe ExecutorFuncionario o método main
    Instanciar um objeto de funcionario (lembrar do new)
    Atribuir valor para cada um dos atributos
    Instanciar mais dois objetos e atribuir valor para os atributos
    Apresentar os dados dos objetos com todos os atributos
*/
