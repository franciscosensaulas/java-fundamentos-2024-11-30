import javax.swing.JOptionPane;

public class ExemploStringMetodosMagicos {
    public static void main(String[] args) {
        // RemoverEspacosDoComecoFim();
        // SubstituirNaString();
        // ConvertParaMinusculo();
        VerificarContemTexto();
    }

    private static void RemoverEspacosDoComecoFim() {
        String textoComEspacos = "    Valorant n é o jogo do ano     ";
        // Remover os espaços do começo e do final da string, mantendo os espaços no
        // meio da string
        String textoSanitizado = textoComEspacos.trim();
        JOptionPane.showMessageDialog(null, "Texto: '" + textoSanitizado + "'");
    }

    private static void SubstituirNaString() {
        String valorEntrada = "R$ 2.394,20"; // "2394.20";

        // valorEntrada = valorEntrada.replace("R$", ""); // " 2.394,20"
        // valorEntrada = valorEntrada.replace(".", ""); // " 2394,20"
        // valorEntrada = valorEntrada.replace(",", ".");
        // valorEntrada = valorEntrada.trim();

        valorEntrada = valorEntrada
                .replace("R$", "")
                .replace(".", "")
                .replace(",", "")
                .trim();

        // Converter o texto para double
        double valor = Double.parseDouble(valorEntrada);
        JOptionPane.showMessageDialog(null, "Valor: " + valor);
    }

    private static void ObterTamanhoString() {
        String texto = "  Meu curso é o Java Fundamentos ".trim();
        int tamanhoTexto = texto.length();

        JOptionPane.showMessageDialog(null, "Texto: " + texto + "\nTamanho texto" + tamanhoTexto);
    }

    private static void ConvertParaMinusculo() {
        String texto = "Meu curso é o Java Fundamentos";
        texto = texto.toLowerCase();

        JOptionPane.showMessageDialog(null, "Texto: " + texto);
    }

    private static void ConvertParaMaiuscula() {
        String texto = "Meu curso é o Java Fundamentos";
        texto = texto.toUpperCase();

        JOptionPane.showMessageDialog(null, "Texto: " + texto);
    }

    private static void VerificarTextoComecaCom() {
        String nomeFilme = "Star Wars Guerra dos Clones";

        if (nomeFilme.startsWith("Star Wars")) {
            JOptionPane.showMessageDialog(null, "Autor é Jorge Lucas");
        } else {
            JOptionPane.showMessageDialog(null, "Filme não é do Star Wars, n sabemos o autor");
        }
    }

    private static void VerificarTextoTerminaCom() {
        String placaVideo = JOptionPane.showInputDialog("Digite o nome da placa de vídeo");

        double preco = 0;
        if (placaVideo.endsWith("4060")) {
            preco = 2200;
        } else if (placaVideo.endsWith("4070")) {
            preco = 6900;
        } else if (placaVideo.endsWith("4080")) {
            preco = 9200;
        } else if (placaVideo.endsWith("4090")) {
            preco = 14000;
        } else {
            JOptionPane.showMessageDialog(null, "Não vendemos essa placa de vídeo");
            return; // Encerra a execução do método, ou seja, no cenário atual n será apresentado a
                    // mensagem do preço
        }

        JOptionPane.showMessageDialog(null, "Preço da " + placaVideo + " é " + preco);
    }

    private static void VerificarContemTexto() {
        String texto = JOptionPane.showInputDialog("Digite o nome do jantar: ");
        String nomeProdutoAlergia = "jaca";

        if (texto.toLowerCase().contains(nomeProdutoAlergia.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "CUIDADO: n consuma o alimento pois você tem alergia");
        } else {
            JOptionPane.showMessageDialog(null, "Pode jantar de boas");
        }
    }
}
