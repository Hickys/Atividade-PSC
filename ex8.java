import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args) {
        // declaração de variáveis
        double eleitores, brancos, nulos, validos, totalbrancos, totalnulos, totalvalidos;

        // entrada de dados
        brancos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos votos em branco existem:"));
        nulos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos votos nulos existem:"));
        validos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos votos válidos existem:"));

        // processamento de dados
        eleitores = brancos + nulos + validos;
        totalbrancos = brancos / eleitores * 100;
        totalnulos = nulos / eleitores * 100;
        totalvalidos = validos / eleitores * 100;
        // saida
        JOptionPane.showMessageDialog(null, "Há "+ totalbrancos + "% de votos brancos, " + totalnulos + "% de votos nulos" + " e " + totalvalidos + "% de votos válidos" + ", resultando em " + eleitores + " eleitores");
    }
}
