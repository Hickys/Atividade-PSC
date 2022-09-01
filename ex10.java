import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args) {
        // declaração de variáveis
        double custoFabrica, custoTotal1, custoTotal2, custoCon;

        // entrada de dados
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do custo de fábrica"));

        // processamento de dados
        custoTotal1 = (custoFabrica * 0.28);
        custoTotal2 = (custoFabrica * 0.45);
        custoCon = custoFabrica + custoTotal1 + custoTotal2;
        // saida
        JOptionPane.showMessageDialog(null, "O valor o carro será de: R$"+custoCon);
    }
}
