import java.util.Scanner;

public class desafio3_8c {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime la fila ");
        int num_fila = keyboard.nextInt();
        keyboard.close();
        
        for (int i = 1; i <= num_fila; i++) {

            for (int blanco = 1; blanco <= num_fila-i; blanco++) {
                System.out.print(" ");

            }

            for (int asteriscos = 1; asteriscos <= i*2-1; asteriscos++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
