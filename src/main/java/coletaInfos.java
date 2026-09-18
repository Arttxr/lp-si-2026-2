import java.util.Scanner;
class coletaInfos {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual é o seu nome?");
    String nome = sc.nextLine();
    System.out.println("qual cidade você nasceu?");
    String local = sc.nextLine();
    System.out.println("Ola "+nome+"! Que legal saber que você é da cidade "+local);

    sc.close();
    }
}
