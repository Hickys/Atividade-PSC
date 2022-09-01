import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args) {
        // declaração de variáveis
        double base, altura, area;

        // entrada de dados
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo"));

        // processamento de dados
        area = (base * altura) / 2;
        // saida
        JOptionPane.showMessageDialog(null, "A área do triângulo é: "+ area);
    }
}
