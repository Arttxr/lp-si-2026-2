import java.util.Scanner;
public class salarioComBonus {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String nome = sc.nextLine();
        double salarioFixo = Double.parseDouble(sc.nextLine());
        double vendas = Double.parseDouble(sc.nextLine());

        double salarioTotal = salarioFixo + (vendas*0.15);
        System.out.printf ("TOTAL = %.2f%n", salarioTotal);
        sc.close();
    }
}
