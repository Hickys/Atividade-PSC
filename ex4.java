import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args) {
        // declaração de variáveis
        int valor, sub;

        // entrada de dados
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

        // processamento de dados
        sub =  valor - 1;
        // saida
        JOptionPane.showMessageDialog(null, "O antecessor de " + valor + "é: " + sub);
    }
}
