import java.util.Scanner;

public class desafio3_16c {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime nombre 1");
        String nombre1 = keyboard.next().toLowerCase();

        System.out.println("Dime nombre 2");
        String nombre2 = keyboard.next().toLowerCase();

        if (nombre1.charAt(0) == nombre2.charAt(0) || nombre1.charAt(nombre1.length()-1) == nombre2.charAt(nombre2.length()-1)) {
            System.out.println("Se ha encontrado una coincidencia.");
        } else {
            System.out.println("No se ha encontrado nada.");
        }

        keyboard.close();
    }
}
// Ask to the user for the name of 2 persons and store them into variables.
// Then you have to print “coincidence” if the names of both persons 
// start by the same letter or if they finish by the same letter. In any 
// other case, print “there is NO coincidence”.
// Example of execution:
// Enter the name of person 1:
// Emilio
// Enter the name of person 2:
// Eugenia
