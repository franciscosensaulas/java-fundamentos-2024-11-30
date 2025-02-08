package br.com.nossa.empresa.epicsteam.exemplos;

public class ExemploTryCatch {

    public static void main(String[] args) {
        tratamentoMultiplasVezes();
    }

    private static void tratamentoErroInteiro() {
        try {
            String texto = "2t";
            int numero = Integer.parseInt(texto);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível converter para inteiro");
            System.out.println("Erro ocorrido: " + e.getMessage());
        }

        System.out.println("Finalizou a execução");
    }

    private static void tratamentoErroNull() {
        // Tratamento de erro: para que a aplicação continue a funcionar 
        // corretamente e o usuário seja notificado de que o erro ocorreu 
        try {
            Cachorro doguinho = new Cachorro();
            String apelido = doguinho.getApelido();
            System.out.println("Apelido: " + apelido.toLowerCase());
        } catch (NullPointerException ex) {
            System.out.println("Ocorreu um erro ao tentar acessar o apelido");
        }
    }

    private static void tratamentoMultiplasVezes() {
        int numero1 = 0;
        boolean dadosValidos = true;
        try {
            numero1 = Integer.parseInt("3");
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível converter o número 1");
            dadosValidos = false;
        }
        int numero2 = 0;
        try {
            numero2 = Integer.parseInt("4");
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível converter o número 2");
            dadosValidos = false;
        } catch(Exception e){
            System.out.println("Ocorreu um erro não esperado: " + e.getMessage());
            dadosValidos = false;
        }
        if (dadosValidos == false)
            return;
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }
}

class Cachorro {

    private String apelido;
    private int idade;
    private boolean vivo;

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

}
