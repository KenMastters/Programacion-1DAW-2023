import java.util.Scanner;

public class desafio3_16k {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String password = "myCatHarry";
        System.out.println("Introduce la contraseña");
        String introducido = keyboard.next();

        if (introducido.toLowerCase().equals(password.toLowerCase())) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        keyboard.close();
    }
}
