import java.util.Scanner;

public class desafio3_16e {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime una vocal");
        String vocal = keyboard.next();
        
        if (vocal.charAt(0) > 1) {
            if (vocal.charAt(0) == 'a' || vocal.charAt(0) == 'e' || vocal.charAt(0) == 'i' || vocal.charAt(0) == 'o' || vocal.charAt(0) == 'u') {
                System.out.println("Es una vocal");
            } else {
                System.out.println("¡Tienes que introducir una vocal!");
            }
        } else {
            System.out.println("Solo puedes añadir vocales.");
        }
        keyboard.close();
    }
}

// Ask to the user for a String. If the String is a
//  vowel (a, e, i, o, u) show the message “It is a vowel”, otherwise show “It is NOT a vowel”.
// If the user enters more than one character, show an error informing that this is not possible.
// Example of execution:
// Please, enter a String:
// i
// It is a vowel
