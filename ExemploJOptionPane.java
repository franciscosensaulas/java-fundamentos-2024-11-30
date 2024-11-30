import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "Bem vindo ao sistema da ProWay");

	String aluno = JOptionPane.showInputDialog("Digite o nome do aluno");
	double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
	double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
	double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
	int anoNascimento = Integer.parseInt(
		JOptionPane.showInputDialog("Digite o ano de nascimento"));

	double media = (nota1 + nota2 + nota3) / 3;
	// https://dontpad.com/faulas/java
	JOptionPane.showMessageDialog(null, 
		"Aluno: " + aluno +
		"\nNota 1: " + nota1 + 
		"\nNota 2: " + nota2 + 
		"\nNota 3: " + nota3 +
		"\nMédia: " + media +  
		"\nAno de nascimento: " + anoNascimento);
    }
}