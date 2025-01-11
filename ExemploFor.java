

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ExemploFor {
    public static void main(String[] args) throws IOException {
        exemploCriarDiretorios();
    }

    private static void exemploBasico(){
        // enviar cinco e-mails, devemos perguntar os e-mails e o texto
        String texto = JOptionPane.showInputDialog("Digite o texto do e-mail");
        String assunto = JOptionPane.showInputDialog("Digite o assunto do e-mail");

        // int indice = 0;
        // while (indice < 5){
        //     String email = JOptionPane.showInputDialog("Digite o e-mail do destinatário");
        //     JOptionPane.showMessageDialog(null, "Enviando e-mail para " + email);

        //     JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso");

        //     indice = indice + 1;
        // }
        // for(declaracao; condição; incremento/decremento)
        for(int indice = 0; indice < 5; indice = indice + 1){
            String email = JOptionPane.showInputDialog("Digite o e-mail do destinatário");
            JOptionPane.showMessageDialog(null, "Enviando e-mail para " + email);

            JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso");
        }
    }

    private static void exemploContagemRegressiva(){
        // 10
        // 9
        // 8
        // 0
        System.out.println();
        for(int i = 10; i >= 0; i = i - 1){
            System.out.println(i);
        }
    }

    private static void exemploCriarDiretorios() throws IOException{
        // Criar pastas dentro do desktop aula01, aula02, aula03...
        // Obter a pasta do usuário no windows, ex.: C:\Users\nomeusuario
        String pastaHomeUsuario = System.getProperty("user.home");
        // Obter a pasta desktop do usuário, ex.: C:\Users\nomeusuario\Desktop
        Path pastaAreaTrabalho = Paths.get(pastaHomeUsuario, "Desktop");

        // Gerar o caminho C:\Users\nomeusuario\Desktop\curso-java
        Path pastaCursoJava = pastaAreaTrabalho.resolve("curso-java");

        Files.createDirectories(pastaCursoJava);

        for(int i = 0; i < 3; i = i + 1){
            String conteudo = "Olá mundo";

            Path caminhoArquivo = pastaCursoJava.resolve("arquivo-" + i + ".txt");
            // Criar um arquivo com o conteúdo "Olá mundo"
            Files.write(caminhoArquivo, conteudo.getBytes());

            System.out.println("Criado arquivo: " + caminhoArquivo.toString());
        }
    }
}
