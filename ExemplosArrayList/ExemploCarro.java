package ExemplosArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploCarro {
    private ArrayList<String> carros = new ArrayList<>();

    public void executar() {
        String[] menus = new String[] { "Cadastrar", "Listar", "Atualizar", "Apagar", "Sair" };
        int menuEscolhido = 0; // Esse valor será sobreescrito pela escolha do usuário do menu

        do {
            menuEscolhido = JOptionPane.showOptionDialog(
                    null,
                    "Escolha a operação desejada",
                    "Sistema de Carros",
                    0,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    menus,
                    "Cadastrar");
            if (menuEscolhido == 0)
                criarCarro();
            else if (menuEscolhido == 1)
                listarCarros();
            else if (menuEscolhido == 2)
                atualizarCarro();
            else if (menuEscolhido == 3)
                apagarCarro();

            // Enquanto o menu escolhido for diferente do 4 (posição do botão sair) e menu
            // escolhido for diferente de -1 (quando o usuário apertar o x de fechar do
            // janela o menu escolhido recebe -1)
        } while (menuEscolhido != 4 && menuEscolhido != -1);
    }

    // CRUD
    // Create
    private void criarCarro() {
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro");

        // Adicionar o carro na lista de carros
        carros.add(modelo);
    }

    // Read
    private void listarCarros() {
        if (carros.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado");
            return;
        }

        String nomes = "";

        // for(declaracao; condicao; incremento/decremento)
        for (int i = 0; i < carros.size(); i = i + 1) {
            String modelo = carros.get(i);
            nomes += modelo + "\n";
        }
        JOptionPane.showMessageDialog(null, "Modelos:\n" + nomes);
    }

    // Update
    private void atualizarCarro() {
        int indiceCarroParaEditar = JOptionPane.showOptionDialog(
                null,
                "Escolha o carro que deseja alterar",
                "Sistema de carros",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                carros.toArray(),
                "");

        // Obter o carro que o usuário escolheu
        String modelo = carros.get(indiceCarroParaEditar);

        // Perguntar para o usuário qual será o nome do novo modelo
        String novoModelo = JOptionPane.showInputDialog(
                null,
                "Digite o novo nome do carro",
                modelo);
        while (novoModelo.length() < 2 || novoModelo.length() > 20) {
            JOptionPane.showMessageDialog(null, "Nome do carro deve conter entre 2 e 20 caracteres");

            novoModelo = JOptionPane.showInputDialog(
                    null,
                    "Digite o novo nome do carro",
                    modelo);
        }

        // Atualizar o nome do modelo na lista de carros
        carros.set(indiceCarroParaEditar, novoModelo);
    }

    // Delete
    private void apagarCarro() {
        int indiceCarroParaApagar = JOptionPane.showOptionDialog(
                null,
                "Escolha o carro que deseja apagar",
                "Sistema de carros",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                carros.toArray(),
                "");
        // Remover o carro escolhido da lista de carros
        carros.remove(indiceCarroParaApagar);
    }

    
}
// Ex. 1: Criar uma classe ExemploColaborador
// Criar os métodos privados: criar, editar, apagar, listar. Os métodos n devem ter nada dentro
// Criar o método publico: executar()
// Criar o ArrayList de String para armazenar o nome dos colaboradores
// Adicionar no método criar a funcionalidade de:
//  - Solicitar para o usuário o nome do colaborador
//  - Adicionar no ArrayList de colaboradores o nome do colaborador solicitado
// Chamar o método criar no método executar
// Alterar o arquivo ExemploForArrayList para chamar o ExemploColaborador, da mesma forma que foi feito para ExemploCarro
// Implementar o listar utilizando como base o listarTodos do ExemploCarro
// Chamar o método listar no método executar

// Exemplo de como criar método:
//  private void nome(){

// }