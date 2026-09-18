import java.util.Scanner;
class mediaComPeso {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = Double.parseDouble(sc.nextLine());
        double nota2 = Double.parseDouble(sc.nextLine());
        double nota3 = Double.parseDouble(sc.nextLine());
        double media = ((nota1*2)+ (nota2*3)+ (nota3*5))/10;
        System.out.printf("MEDIA = %.1f%n", media);

    }
}
