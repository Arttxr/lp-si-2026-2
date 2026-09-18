import java.util.Scanner;
public class adoleta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int k = 0;

        for ( k = 0; k<n; k++){
            int num = Integer.parseInt(sc.nextLine());
            if (num<0) {
                if (num % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }else {
                if (num % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }

            }

        }

    sc.close();
    }
}


