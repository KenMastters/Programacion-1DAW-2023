import java.util.Scanner;


public class desafio3_15_alternativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a leer: ");
        String texto = sc.nextLine();
        String reversed = "";
        char c;

        for (int i = 0; i < texto.length(); i++) {
            c = texto.charAt(i);
            reversed = c + reversed;
        }
        
        if (texto.toLowerCase().replace(" ", "").equals(reversed.toLowerCase().replace(" ", ""))) {
            System.out.println("Lo introducido es un palindromo.");
            System.out.println(texto.replace(" ", ""));
            System.out.println(reversed.replace(" ", ""));
        } else {
            System.out.println("Lo introducido no es un palindromo.");
            System.out.println(texto.replace(" ", ""));
            System.out.println(reversed.replace(" ", ""));
        }

        
        sc.close();
    }
}
