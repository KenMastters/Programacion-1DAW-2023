import java.util.Scanner;

public class desafio3_16c {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre1 = keyboard.next().toLowerCase();
        System.out.println("Dime el nombre de tu vecina");
        String nombre2 = keyboard.next().toLowerCase();

        if (nombre1.charAt(0) == nombre2.charAt(0) || nombre1.charAt(nombre1.length()-1) == nombre2.length()-1) {
            System.out.println("Hay coincidencia");
        } else {
            System.out.println("No hay coincidencia");
        }
        
        keyboard.close();
    }
}

// Solicite al usuario el nombre de 2 personas y guárdelos en variables.
// Luego hay que imprimir “coincidencia” si los nombres de ambas personas
//  comienzan con la misma letra o si terminan con la misma letra. En cualquier otro caso, 
//  escriba “NO hay coincidencia”.
// Example of execution:
// Enter the name of person 1:
// Emilio
// Enter the name of person 2:
// Eugenia
// coincidence
