import javax.swing.JOptionPane;
public class IMC {
    public static void main (String[] args){
    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
    double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        System.out.printf("Seu IMC é: %.2f%n", peso / (altura * altura));



    }
}
