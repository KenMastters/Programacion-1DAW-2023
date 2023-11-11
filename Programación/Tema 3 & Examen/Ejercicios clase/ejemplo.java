import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        System.out.println("Introduzca un carácter: ");
        Scanner keyboard = new Scanner(System.in);
        String c = keyboard.next(); //Si quiero leer una linea completa como "Hola caracola" cambiamos el next a nextline.
        System.out.println(c);
        keyboard.close();

    }
}
