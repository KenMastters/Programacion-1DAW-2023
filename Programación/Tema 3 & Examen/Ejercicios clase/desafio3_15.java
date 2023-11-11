import java.util.Scanner;


public class desafio3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a leer: ");
        String texto = sc.next();
        String reversed = "";
        char c;

        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            reversed = c + reversed;
        }
        
        if (texto.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println("Lo introducido es un palindromo.");
        } else {
            System.out.println("Lo introducido no es un palindromo.");
        }

        
        sc.close();
    }
}
