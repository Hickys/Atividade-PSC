import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        // declaração de variáveis
        double cotacaoDolar, dolar, total;

        // entrada de dados
        cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dólar atual:"));
        dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Doláres: "));

        // processamento de dados
        total = dolar * cotacaoDolar;

        // saida
        JOptionPane.showMessageDialog(null, "O valor em reais será: " + total);
    }
}