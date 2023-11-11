import java.util.Scanner;

public class desafio3_16n {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = keyboard.nextLine().toLowerCase();
        System.out.println("Dime una letra");
        char letter_c = keyboard.next().toLowerCase().charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letter_c) {
                contador++;
            }
        }

        System.out.println("La letra: "+ letter_c + " ha aparecido: "+contador);

        keyboard.close();

    }
}

// [PRINCIPIANTE] Número de veces que aparece una letra en una oración.
// Solicitar al usuario una frase (frase).
// Solicitar al usuario una carta.
// Di la cantidad de veces que esta letra aparece en la oración.
// Consejo: para convertir un gráfico en una Cadena puedes usar (de esta manera, puedes comparar un carácter con una Cadena):
// char letra = 'a';
// String letraString = String.valueOf(letra);
// Ejemplo de ejecución:
// Introduce una frase:
// Hola caracola
// Introduzca una letra:
// a
// El número de veces que aparece la letra en la oración es:
// 4

