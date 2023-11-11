import java.util.Scanner;

public class desafio3_16h {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase = keyboard.nextLine();
        String vocalStr; // Necesitamos todo porque scanner lee String.
        char vocal; //La vocal character

        do {
            System.out.println("Dime una vocal");
            vocalStr = keyboard.next(); //Leemos la vocal
            vocal = vocalStr.charAt(0); // Cogemos del String "vocalStr" la primera vocal con charat 0 y esa es nuestra vocal
        } while (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u');

        for (int i = 0; i < frase.length(); i++) { // Bucle para recorrer la frase entera
            if (frase.charAt(i) == vocal) { // Comparamos si la letra por donde va el recorrido es igual a la vocal
                System.out.print(Character.toUpperCase(vocal)); // La pasamos a mayus con esto
            } else {
                System.out.print(frase.charAt(i)); // Si no es igual a la vocal se seguirá imprimiendo normal.
            }
        }
        
        keyboard.close();   
    }
}

//h.Cambiar a mayúscula una vocal en una oración.
// Solicita una oración (frase) al usuario.
// Solicita una vocal al usuario (almacenala como un String).
// Muestra la misma oración pero con la vocal ingresada por el usuario en mayúscula.
// Consejo: para convertir un gráfico en un String puedes usar (de esta manera, 
// puedes comparar un carácter con un String):
// char letra = 'a';
// String letraString = String.valueOf(letra);
// Ejemplo de ejecución:
// Introduce una frase:
// En un lugar de la Mancha
// Introduce una vocal:
// a
// En un lugAr de la MANcha

