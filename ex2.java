import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        // declaração de variáveis
        double primeiroValor, segundoValor, terceiroValor, quartoValor, quadrado ;

        // entrada de dados
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        quartoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));

        //processamento de dados
        quadrado = (primeiroValor * primeiroValor) + (segundoValor * segundoValor) + (terceiroValor * terceiroValor) + (quartoValor * quartoValor);
        //saida
        JOptionPane.showMessageDialog(null, "A soma de todos os quadrados resulta em: " + quadrado);
    }
}

