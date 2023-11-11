import java.util.Scanner;

public class desafio3_16t {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un mensaje");
        String mensaje = keyboard.nextLine();
        System.out.println("Introduce una clave");
        int clave = keyboard.nextInt();
        String cifrado = "";

        for (char c : mensaje.toCharArray()) {
            if (c != ' ') {

                cifrado = cifrado + (char)(c + clave);
                
            } else {
                cifrado = cifrado + c;
            }
        }
        System.out.println(cifrado);

        keyboard.close();

    }
}

// Cifre un mensaje utilizando el “cifrado César”.
//  Consiste en mover cada letra 1 posición. Por ejemplo,
//   A sería B, B sería C, y así sucesivamente. La Z sería la A.
// Modifíquelo para preguntarle al usuario por el número de letras
//  a mover (con 2, la A ahora sería C).