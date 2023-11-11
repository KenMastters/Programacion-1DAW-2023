import java.util.Scanner;

public class desafio3_16d {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        do {
            menuDesplegable();
            String eleccion = keyboard.next().toLowerCase();
            if (eleccion.charAt(0) == 'a') {
                System.out.println("Has elegido la opción A y has votado a the cool party, gracias!");
                System.exit(i);
            } else if (eleccion.charAt(0) == 'b') {
                System.out.println("Has elegido la opción B y has votado a the angry party, gracias!");
                System.exit(i);
            } else if (eleccion.charAt(0) == 'c') {
                System.out.println("Has elegido la opción C y has votado a the supercrazy party, gracias!");
                System.exit(i);
            } else {
                System.out.println("Has seleccionado una opcion que no existe, intentalo de nuevo.");
            }
        } while (i < 1);
        keyboard.close();
    }
    public static void menuDesplegable() {

        System.out.println("**** Bienvenido al menú para votar ****");
        System.out.println("Opción A - Votar a The cool party");
        System.out.println("Opción B - Votar a The angry party");
        System.out.println("Opción C - Votar a The supercrazy party");
        System.out.println("***************************************");
        
    }
}
