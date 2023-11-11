import java.util.Scanner;

public class desafio3_13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce hello world por el chat");
        String texto = keyboard.nextLine();
        String porcion = texto.substring(0, 4);

        if (texto.equals(porcion)) {
            System.out.println("Contiene Hello en mayus");
        } else if (texto.equals(porcion)) {
            System.out.println("Contiene hello en minuscula");
        } else {
            System.out.println("No contiene hello");
        }
        





        keyboard.close();
    }
}
