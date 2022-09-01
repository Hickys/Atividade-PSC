import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        // declaração de variáveis
        int ano, dias, meses, total;

        // entrada de dados
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos de vida você tem:"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses de vida você tem:"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias de vida você tem:"));

        // processamento de dados
        total = (meses * 30) + (ano * 365) + dias;
        // saida
        JOptionPane.showMessageDialog(null, "Você tem: "+ total + " dias de vida");
    }
}
