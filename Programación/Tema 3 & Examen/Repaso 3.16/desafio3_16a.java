import java.util.Scanner;

public class desafio3_16a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabajaste hoy día?");
        double horas = keyboard.nextDouble();
        System.out.println("¿Cuanto cobras a la hora?");
        double salario = keyboard.nextDouble();
        
        System.out.println("Tu salario de hoy es: "+horas * salario);

        keyboard.close();
    }
}
