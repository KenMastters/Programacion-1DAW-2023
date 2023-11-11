import java.util.Scanner;

public class desafio3_16d {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        int i = 0;

        do {
            menuDesplegable();
            String eleccion = keyboard.next();
            if (eleccion.toLowerCase().charAt(0) == 'a') {
                System.out.println("¡Has votado a cool party!");
                System.exit(i);
            
            } else if (eleccion.toLowerCase().charAt(0) == 'b') {
                System.out.println("¡Has votado a angry party!");
                System.exit(i);
            
            } else if (eleccion.toLowerCase().charAt(0) == 'c') {
                System.out.println("¡Has votado a supercrazy party!");
                System.exit(i);

            } else {
                System.out.println("Has introducido algo incorrecto");
            }
        } while (i < 1);

        keyboard.close();
    }
    public static void menuDesplegable() {
        System.out.println("** Bienvenido al menú para votar **");
        System.out.println("A - Opción para votar a 'The cool party'");
        System.out.println("B - Opción para votar a 'The angry party'");
        System.out.println("C - Opción para votar a 'The supercrazy party'");
        System.out.println("*********************************************");
    }
}
