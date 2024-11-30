// Comentário em linha
// Toda classe deve seguir o padrão PascalCase

public class Exemplo01 {
    // Método main é a porta de entrada
    public static void main(String[] args){
        // Aqui fica o código que será executado

        // Apresentar uma mensagem para o usuário
        System.out.print("Olá mundo");
        System.out.println(" Francisco");
        System.out.println("Curso de Java Fundamentos");
        System.out.println("Soma: " + (9 + 8));
        System.out.println("Subtração: " + (9 - 8));
        System.out.println("Mulitiplicação: " + (9 * 8));
        System.out.println("Divisão: " + (9 / 2));
        System.out.println("Resto da divisão: " + (9 % 2)); 

	// print => apresenta o texto e deixa o cursor na mesma linha
	// println => apresenta o texto e desloca o cursor para linha abaixo
    }
}

// Compilar: javac Exemplo01.java
// Executar: java Exemplo01