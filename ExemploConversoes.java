public class ExemploConversoes {
    public static void main(String[] args){
        String numeroTexto = "20";
       	// Converter de String para int
        int numero = Integer.parseInt(numeroTexto);
	
	// Converter de String para double
	double salario = Double.parseDouble("2350.49");

	// Converter de String para boolean
	boolean empregado = Boolean.parseBoolean("true");
	
	System.out.println("Número: " + numero);
	System.out.println("Salário: " + salario);
	System.out.println("Empregado: " + empregado);
    }
}