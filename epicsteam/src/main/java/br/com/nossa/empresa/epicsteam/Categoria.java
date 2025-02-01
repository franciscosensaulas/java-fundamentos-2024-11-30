package br.com.nossa.empresa.epicsteam;

public class Categoria {

    // Atritutos (são caracteristicas)
    private int id;
    private String nome;

    // Método que permite definir o id (armazenando o identificador da categoria
    public void setId(int idParaArmazenar) {
        // Armazenando o idPAraArmazenar no atributo id(que é privado)
        this.id = idParaArmazenar;
    }
    
    // Método que permite obter o id(armazenado no id privado)
    public int getId() {
        return this.id;
    }

    public void setNome(String nomeParaArmazenar) {
        this.nome = nomeParaArmazenar;
    }

    public String getNome() {
        return this.nome;
    }
    
    // Criar uma classe chamada Jogo
    // Atributos: 
    //  - id(int)
    //  - nome(String)
    //  - preco (double)
    //  - categoria (String)
    //  - classificacaoIndicativa(int)
    //  - nota(double)
    // Criar o set e get para cada um dos atributos
}
