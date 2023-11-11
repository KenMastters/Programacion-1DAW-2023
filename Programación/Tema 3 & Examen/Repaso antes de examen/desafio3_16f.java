import java.util.Scanner;

public class desafio3_16f {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellidos");
        String datos = keyboard.nextLine().toLowerCase();

        Scanner sc = new Scanner(datos);
        while (sc.hasNext()) {
            String token = sc.next();
            System.out.print(Character.toUpperCase(token.charAt(0)) + token.substring(1) + " ");
        }

    keyboard.close();
    sc.close();
    }
}

// f.	Writing the name of a person with lowercase, lowercase and initials in upper.
// Ask for the full name of a person.
// Write the name in lowercase, in uppercase and with the initial letter of each word in Uppercase.
// Example of execution:
// Enter the full name of a person:
// AITOR Tilla Segura
// Minúsculas:
// aitor tilla segura
// Mayúsculas:

