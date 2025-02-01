public class ExemploVariaveis {
    public static void main(String[] args){
        // tipo da variavel + nomeVariavel = valor;
	// nome de variáveis deve ser no padrão camelCase
        String nome = "Pedro";
        String sobrenome = "da Silva";
        int idade = 30; // números inteiros
	double salario = 3023.10; // números reais
	boolean empregado = true; // boolean é o tipo lógico, armazena true ou false

	String nomeCompleto = nome + " " + sobrenome;
	double valorHora = salario / 220;

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
	System.out.println("Nome completo: " + nomeCompleto);
	System.out.println("Idade: " + idade);
	System.out.println("Salário: " + salario);
	System.out.println("Valor hora: " + valorHora);
	System.out.println("Empregado: " + empregado); 
	
	// Tipos
	// String => texto
	// int => número inteiro 
	// double => número real
	// boolean => lógico true(verdadeiro) ou false(falso)


	
    }
}