import java.util.Scanner;

public class desafio3_16c {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Dime tu nombre 1");
        String nombre1 = keyboard.next();
        System.out.println("Dime tu nombre 2");
        String nombre2 = keyboard.next();

            if (nombre1.charAt(0) == nombre2.charAt(0) || nombre1.charAt(nombre1.length()-1) == nombre2.charAt(nombre2.length()-1)) {
                System.out.println("Hay coincidencia");
            } else {
                System.out.println("No tenemos coincidencia");
        }
        keyboard.close();
    } 
}
