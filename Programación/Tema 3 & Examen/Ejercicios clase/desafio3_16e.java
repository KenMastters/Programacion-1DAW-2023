import java.util.Scanner;

public class desafio3_16e {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un String");
        String introducido = keyboard.next().toLowerCase();

        if (introducido.length() == 1 && introducido.charAt(0) == 'a' || introducido.charAt(0) == 'e' || introducido.toLowerCase().charAt(0) == 'i' || introducido.toLowerCase().charAt(0) == 'o' || introducido.toLowerCase().charAt(0) == 'u') {
            System.out.println("Has introducido una vocal.");
        } else {
            System.out.println("No has introducido una vocal.");
        }
    
        keyboard.close();
    
    }
}