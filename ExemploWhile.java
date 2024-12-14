import javax.swing.JOptionPane;

public class ExemploWhile {
    public static void main(String[] args) {
        exemploQuantidadePorCategoria();
    }

    private static void exemplo01() {
        int indice = 0;
        // Repetir enquanto o indice for menor ou igual a 4
        while (indice <= 4) {
            System.out.println("Olá mundo");
            // indice = 0 + 1 => 1
            // indice = 1 + 1 => 2
            // indice = 2 + 1 => 3
            indice = indice + 1;
        }
    }

    // franciscosensaulas.com => Java Fundamentos
    private static void exemploSoma() {
        // Solicitar os nomes de 3 pacientes
        int indice = 0;
        // Variável que contém a quantidade de pacientes que será solicitado as
        // informações
        int quantidadePacientes = 3;
        int soma = 0;// Acumulador das idades
        // Enquanto o indice não for menor que a quantidade de pacientes que deseja
        // solicitar as informações, repetirá
        while (indice < quantidadePacientes) {
            // Solicitar o nome do paciente
            String nomePaciente = JOptionPane.showInputDialog("Digite o nome do(a) paciente");
            // Solicitar a idade, convertendo o que o usuário digita String para inteiro
            int idadePaciente = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do(a) " + nomePaciente));
            // Adiciona a idade do paciente atual na variável da soma das idades
            soma = soma + idadePaciente;
            // Incrementar a variável indice, a
            indice = indice + 1;
        }
        // Apresenta a soma das idades dos pacientes
        JOptionPane.showMessageDialog(null, "A soma das idades é: " + soma);
    }

    private static void exemploMaiorNumero() {
        // Solicitar x números e apresentar o maior número
        int indice = 0;
        // Variável para armazenar o maior número
        int maiorNumero = 0;
        // Enquanto o indice for menor que 5, repetirá
        while (indice < 5) {
            // Solicitar o número para o usuário
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
            // Se o número que o usuário digitou for maior que o maior número
            if (numero > maiorNumero) {
                // Maior número receberá o número que o usuário digitou
                maiorNumero = numero;
            }
            // Incrementar a variáve, indice
            indice = indice + 1;
        }
        // Apresentar feedback para o usuário
        JOptionPane.showMessageDialog(null, "Maior número: " + maiorNumero);
    }

    private static void exemploMenorNumero() {
        // Solicitar x pesos apresentar o menor peso
        int indice = 0;
        double menorPeso = 1_000_000_000;
        String nomeMenorPeso = "";
        while (indice < 4) {
            String nome = JOptionPane.showInputDialog("Digite o nome");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));

            if (peso < menorPeso) {
                menorPeso = peso;
                nomeMenorPeso = nome;
            }
            indice = indice + 1;
        }
        JOptionPane.showMessageDialog(null, nomeMenorPeso + " tem o menor peso " + menorPeso);
    }

    private static void exemploMedia() {
        int quantidadeDesejada = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada"));

        int indice = 0;
        double soma = 0;
        while (indice < quantidadeDesejada) {
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));

            soma = soma + salario;

            indice = indice + 1;
        }
        double media = soma / quantidadeDesejada;

        JOptionPane.showMessageDialog(null, "Média dos salários: " + media);
    }

    private static void exemploQuantidadePorCategoria() {
        int indice = 0;
        int quantidadeStarWars = 0, quantidadeHarryPotter = 0, quantidadeEldenRing = 0, quantidadeOutros = 0;

        while (indice < 4) {
            String categoria = JOptionPane.showInputDialog("Digite o nome da categoria do produto").trim().toLowerCase();

            if (categoria.equals("star wars")) {
                quantidadeStarWars = quantidadeStarWars + 1;
            } else if (categoria.equals("harry potter")) {
                quantidadeHarryPotter = quantidadeHarryPotter + 1;
            } else if (categoria.equals("elden ring")) {
                quantidadeEldenRing = quantidadeEldenRing + 1;
            } else {
                quantidadeOutros = quantidadeOutros + 1;
            }
            indice = indice + 1;
        }

        JOptionPane.showMessageDialog(null,
                "Quantidade Star Wars:" + quantidadeStarWars +
                        "\nQuantidade Harry Potter:" + quantidadeHarryPotter +
                        "\nQuantidade Elden Ring:" + quantidadeEldenRing +
                        "\nQuantidade Outros:" + quantidadeOutros);
    }
}

/*
 * 
 * 
 * 
 */