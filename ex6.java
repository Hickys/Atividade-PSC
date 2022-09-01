import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args) {
        // declaração de variáveis
        int ano, dias;

        // entrada de dados
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você tem:"));

        // processamento de dados
        dias = ano * 365;
        // saida
        JOptionPane.showMessageDialog(null, "Você tem: "+ dias + " dias de vida");
    }
}
