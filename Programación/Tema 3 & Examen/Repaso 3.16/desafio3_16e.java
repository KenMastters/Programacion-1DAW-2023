import java.util.Scanner;

public class desafio3_16e {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime una vocal");
        String texto = keyboard.next().toLowerCase();
        
        if (texto.length() == 1) {
            if (texto.charAt(0) == 'a' || texto.charAt(0) == 'e' || texto.charAt(0) == 'i' || texto.charAt(0) == 'o' || texto.charAt(0) == 'u') {
                System.out.println("Es una vocal");
            } else {
                System.out.println("Solo puedes introducir vocales");
            }
        } else {
            System.out.println("Solo puedes introducir 1 caracter");
        }
        keyboard.close();
    }
}

// e.	[BEGINNER] Is it a vowel.
// Ask to the user for a String. If the String is a vowel (a, e, i, o, u) 
// show the message “It is a vowel”, otherwise show “It is NOT a vowel”.
// If the user enters more than one character, show an error informing that 
// this is not possible.
// Example of execution:
// Please, enter a String:
// i
// It is a vowel
