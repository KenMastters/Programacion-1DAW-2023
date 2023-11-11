import java.util.Scanner;
public class desafio3_8b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime la fila ");
        int num_fila = keyboard.nextInt();
        keyboard.close();
        for (int i = 1; i <= num_fila; i++) {
            for (int j = 0; j <= num_fila-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}