import java.util.Scanner;

public class desafio3_16l {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime un numero positivo");
        int introducido = keyboard.nextInt();

        for (int i = 0; i < introducido; i++) {
            if (i % 2 != 0) {
                System.out.print(i+ ", ");
            }
        }
        keyboard.close();
    }
}

// l. [PRINCIPIANTE] Imprime números impares.
// Solicita un número positivo al usuario y
// imprime todos los números “impares” (1,3,5,7,…) del 1
// al número separado por comas.