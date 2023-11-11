import java.util.Scanner;

public class desafio3_16p {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Dime un numero entero");
            int numero = keyboard.nextInt();


        } while (numero != 0);
    }
}

// Leer números int por teclado, hasta que
// el usuario ingrese el número 0.
