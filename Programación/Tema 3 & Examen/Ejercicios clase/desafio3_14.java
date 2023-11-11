import java.util.Scanner;

public class desafio3_14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String password = keyboard.next();
        boolean tieneMinus = false;
        boolean tieneMayus = false;
        boolean tieneletter = false;

        for (int i = 0; i < password.length(); i++)  {
            if (Character.isLowerCase(password.charAt(i))) {
                tieneMinus = true;
            }
            else if (Character.isUpperCase(password.charAt(i))) {
                tieneMayus = true;
              }
            else {
                tieneletter = true;
              } 
            }

            if (tieneMayus && tieneMinus && tieneletter) {
                System.out.println("La contraseña es correcta, tiene mayus, minus y especial!");
            } else {
                System.out.println("la contraseña no cumple los requisitos");
              }
        keyboard.close();

    }
}
