import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        // declaração de variáveis
        double precoUnitario, qntdVendida, total;

        // entrada de dados
        precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça"));
        qntdVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida"));

        // processamento de dados
        total = 0.05 * (precoUnitario * qntdVendida);
        // saida
        JOptionPane.showMessageDialog(null, "A comissão que você irá receber será de: R$"+total);
    }
}