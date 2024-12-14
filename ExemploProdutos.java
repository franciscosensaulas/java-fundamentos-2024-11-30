import javax.swing.JOptionPane;

public class ExemploProdutos {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));

        double precoProdutos = quantidade * preco;

        double percentualDesconto = 0;
        if (quantidade < 100) {
            percentualDesconto = 0.05;
        } else if (quantidade < 250) {
            percentualDesconto = 0.10;
        } else if (quantidade < 500) {
            percentualDesconto = 0.15;
        } else {
            percentualDesconto = 0.20;
        }

        double valorDesconto = precoProdutos * percentualDesconto;
        double totalPedido = precoProdutos - valorDesconto;
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome +
                        "\nQuantidade: " + quantidade +
                        "\nPreço: " + preco +
                        "\nPreço dos produtos: " + precoProdutos +
                        "\nPercentual de desconto: " + (percentualDesconto * 100) + "%" +
                        "\nValor desconto: " + valorDesconto +
                        "\nTotal pedido: " + totalPedido);
    }
}
/*
 * ]
 * https://dontpad.com/faulas/java
 * Ex. 1: Criar uma classe ExercicioBoletim e solicitar os seguintes dados:
 * nome do aluno, nota 1, nota 2, nota 3
 * Calcular a média
 * Caso a média for acima ou igual de 6 apresentar que está aprovado
 * Caso a média for menor que 6 apresentar que está reprovado
 * 
 * Adicionar a solicitação do percentual de frequencia, logo após a solicitação
 * da nota 3
 * Adicionar a condição para reprovar o aluno por frequencia inferior a 75%
 * 
 * Critérios de reprovação:
 * - Mesmo que o aluno tenha média >= 6 se o percentual de frequencia for menor
 * que 75 o aluno está reprovado
 * - Média menor que 6 o aluno está reprovado
 * - Média maior ou igual a 6 e frequencia maior ou igual a 74 aluno está
 * aprovado
 *
 * Ex. 2: Criar uma classe CalculadoraIMC e solicitar os seguintes dados:
 * - Nome da pessoa
 * - Peso (em kg)
 * - Altura (em metros)
 *
 * Calcular o IMC usando a fórmula:
 * IMC = peso / (altura * altura)
 *
 * Apresentar a seguinte classificação:
 * - Abaixo de 18.5: Abaixo do peso
 * - Entre 18.5 e 24.9: Peso normal
 * - Entre 25 e 29.9: Sobrepeso
 * - Acima de 30: Obesidade
 * 
 * Ex. 3: Criar uma classe ValidadorCPF para solicitar um CPF ao usuário.
 * - Solicitar que o usuário informe um CPF no formato: 123.456.789-00
 * - Verificar se o CPF informado tem exatamente 14 caracteres.
 * - Verificar se contém os pontos e o hífen nos locais corretos.
 * - Caso o formato esteja incorreto, exibir uma mensagem de erro.
 * - Caso o formato esteja correto, exibir "CPF válido!".
 * 
 * Ex. 4: Criar uma classe ControleDeIdade.
 * Solicitar o nome e a idade de uma pessoa.
 * Exibir a categoria dela com base na idade:
 * - "Infantil" para idades de 0 a 12 anos.
 * - "Adolescente" para idades de 13 a 17 anos.
 * - "Adulto" para idades de 18 a 59 anos.
 * - "Idoso" para idades de 60 anos ou mais.
 *
 * Adicionar uma condição para verificar se a idade informada é negativa. Caso
 * seja, exibir uma mensagem de erro.
 */
