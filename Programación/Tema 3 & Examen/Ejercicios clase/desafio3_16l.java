import java.util.Scanner;

public class desafio3_16l {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero positivo");
            int numero = sc.nextInt(); 
            
            for (int i = 0; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i+", ");

                sc.close();
        }
            }
    }
}
