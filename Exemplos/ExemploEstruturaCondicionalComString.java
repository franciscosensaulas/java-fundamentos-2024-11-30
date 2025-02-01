public class ExemploEstruturaCondicionalComString {
    public static void main(String[] args){ 
	String produto = "Samsung Odyssey 49 OLED";
	String categoria = "Monitor";
	double preco = 8766.67;

	// Sempre que for comparar a igualdade de string deve-se utilizar .equals
	if (categoria.equals("Monitor")) {
	   preco = 7899.00;
	}
	
	System.out.println("Produto: " + produto);
	System.out.println("Categoria: " + categoria);
	System.out.println("Preço: " + preco);	
    }
}