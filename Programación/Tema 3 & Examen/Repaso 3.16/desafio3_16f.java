import java.util.Scanner;

public class desafio3_16f {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellidos");
        String nombre = keyboard.nextLine().toLowerCase();

        System.out.println("Tus datos en minuscula: "+nombre.toLowerCase());
        System.out.println("Tus datos en mayuscula: "+nombre.toUpperCase());

        Scanner sc = new Scanner(nombre);
        while (sc.hasNext()) {
            String token = sc.next();
            System.out.print(Character.toUpperCase(token.charAt(0)) + token.substring(1) + " ");
        }

        sc.close();
        keyboard.close();
    }
}


// Ask for the full name of a person.
// Write the name in lowercase, in uppercase and with the
// initial letter of each word in Uppercase.
// Example of execution:
// Enter the full name of a person:
// AITOR Tilla Segura
// Minúsculas:
// aitor tilla segura
// Mayúsculas:
// AITOR TILLA SEGURA
// Iniciales mayúsculas:
// Aitor Tilla Segura
