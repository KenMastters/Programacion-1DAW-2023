import java.util.Scanner;

public class desafio3_12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce tu texto: ");
        String texto = keyboard.nextLine();

        if (texto.equals(texto.toLowerCase())) {
            System.out.println("El texto está en minuscula.");
        } else if (texto.equals(texto.toUpperCase())) {
            System.out.println("El texto introducido está en mayuscula.");
        } else {
            System.out.println("El texto es una mezcla de ambas");
        }

        keyboard.close();
    }
}
