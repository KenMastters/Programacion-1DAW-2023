import java.util.Scanner;

public interface desafio3_16i {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime una cantidad euros y centimos.");
        String cantidad = keyboard.next();


        Scanner sc = new Scanner(cantidad); //Declaramos todo scanner para trabajar sobre cantidad.
        sc.useDelimiter("\\."); //Declaramos el limitador que usará ".".
        String token; //Declaramos el token que nos irá devolviendo las cosas.
        token = sc.next(); //Al ser el primer token nos devolverá los euros.
        System.out.println("Euros: "+token);
        token = sc.next(); //Al ser el segundo token nos devolverá los centimos.
        System.out.println("Centimos: "+token);

        sc.close();
        keyboard.close();
    }
}

// i.	[BEGINNER] Number of euros and number of decimals.
// Write a program which store in a String the price in euros with 2 decimals entered by the user.
// Print in screen the number of euros and the number of decimals.
// Example of execution:
// Enter a price in euros:
// 137.22
// The number of euros is:
// 137
// The number of cents is:
// 22
