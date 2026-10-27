import java.util.Scanner;
public class combustivel {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int Gasolina = 0;
        int Alcool = 0;
        int Diesel = 0;

        while (true){
            int num = Integer.parseInt(sc.nextLine());
            if (num == 1){
                Alcool++;

            }else if (num==2){
                Gasolina++;

            } else if (num==3){
                Diesel++;
            }else if (num==4){
                break;

            }else{
                continue;
            }

        }


        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ Alcool);
        System.out.println("Gasolina: "+ Gasolina);
        System.out.println("Diesel: "+ Diesel);}
}
