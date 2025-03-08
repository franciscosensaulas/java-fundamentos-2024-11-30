package br.com.nossa.empresa.epicsteam.exemplos;

public class ExemploInterface {

    public static void main(String[] args) {
        var johnDoe = new JohnDoe();
        johnDoe.beber("Copo de jonny");
        johnDoe.andar();
        johnDoe.sorrir();
        
        var janeDoe = new JaneDoe();
        janeDoe.beber("Copo de água mineral");
        janeDoe.andar();
        janeDoe.sorrir();
    }
}
// características -> atributos
// ações -> métodos

// Interface é um contrato onde é definido quais serão os métodos(comportamentos)
interface AmigoInterface {

    void sorrir(); // Esse método não tem a implementação, apenas sua assinatura

    void andar(); // O mesmo vale para este método que tem como objetivo andar

    void beber(String nomeBebida);
}
// A classe JohnDoe implementar a interface AmigoInterface, ou seja, ela 
// deve implemntar todos os métodos da interface
class JohnDoe implements AmigoInterface {
    // Override é a sobrecrita de métodos da classe pai
    @Override
    public void sorrir() {
        System.out.println("Hahahaha mto engraçado");
    }

    @Override
    public void andar() {
        System.out.println("Caminhando");
    }

    @Override
    public void beber(String nomeBebiba) {
        System.out.println("Glub glub blub, bebendo " + nomeBebiba);
    }
}

class JaneDoe implements AmigoInterface {

    @Override
    public void sorrir() {
        System.out.println("tsik tsik");
    }

    @Override
    public void andar() {
        System.out.println("Desilando");
    }

    @Override
    public void beber(String nomeBebida) {
        System.out.println("Bebendo Aperol Spritz");
    }

}
