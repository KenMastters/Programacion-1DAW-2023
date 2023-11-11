import java.util.Scanner;

public class desafio3_16m {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        int introducido = keyboard.nextInt();
        boolean primo = true;

        for (int i = 0; i < introducido; i++) {
            
            if (introducido % i == 0) {
                primo = false;
            }

        }

        if (primo) {
            
        } else {
            
        }



        keyboard.close();
    }
}

// m. ¿Es un número primo?
// Solicita un número al usuario y díselo
// si es un “número primo” o no.
