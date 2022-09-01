import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
        // declaração de variáveis
        double salario, reajuste, totalreajuste, total;

        // entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de reajuste"));

        // processamento de dados
        totalreajuste = (salario * reajuste /100) ;
        total = totalreajuste + salario; 
        // saida
        JOptionPane.showMessageDialog(null, "O seu novo salário será de: R$"+total);
    }
}
