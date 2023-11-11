import java.util.Scanner;
public class desafio3_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num_filas = keyboard.nextInt();
        keyboard.close();
        for (int i = 1; i <= num_filas; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
        }
    }
}
