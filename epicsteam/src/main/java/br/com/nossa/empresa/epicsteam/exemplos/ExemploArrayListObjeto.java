package br.com.nossa.empresa.epicsteam.exemplos;

import br.com.nossa.empresa.epicsteam.Categoria;
import java.util.ArrayList;

public class ExemploArrayListObjeto {
    public void executar(){
        // Lista de objetos da Categoria
        ArrayList<Categoria> categorias = new ArrayList();
        
        // Instanciar(new) um objeto da categoria
        Categoria rpg = new Categoria();
        rpg.setId(-12);
        rpg.setNome("RPG");
        categorias.add(rpg); // Adicionado 
        
        Categoria acao = new Categoria();
        acao.setId(13);
        acao.setNome("Asão");
        categorias.add(acao);
        
        Categoria moba = new Categoria();
        moba.setId(14);
        moba.setNome("Moba");
        categorias.add(moba);
        
        // alterar o nome da categoria de 'Asão' para 'Ação'
        categorias.get(1).setNome("Ação");
        
        // remover a categoria moba
        categorias.remove(2);
        
        for(int i = 0; i < categorias.size(); i = i +1){
            // Obter a categoria da lista de categorias
            Categoria categoriaPercorrida = categorias.get(i);
            System.out.println("Categoria: " + categoriaPercorrida.getNome());
        }
        // Orientada a Objetos
        // Atributos (caracteristicas)
        // Métodos (ações)
    }
    
    public void executarCliente(){
        /*
            Criar a classe Cliente.java (Vai no pacote br.com.nossa.empresa.epicsteam,
                botão direito, novo java class)
            Colocar as propriedades no Cliente.java
                - id, nome, email, cpf
            Voltar no método executarCliente da classe ExemploArrayListObjeto
            Instanciar objetos dos clientes, adicionando na lista:
                - darthVader
                - anawaki
                - luke
            Alterar o nome do Darth Vader para 'Anakin Skywalker'
            Alterar o e-mail do luke para 'lukitadagalera@gmail.com'
            Remover anawaki da lista
            Apresentar todos os clientes
        */
                
    }
    
    public static void main(String[] args) {
        new ExemploArrayListObjeto().executarCliente();
    }
}
