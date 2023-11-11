import java.util.Scanner;

public class Desafio3_16a {
    public static void main(String[] args) {
        //Preguntar por las horas trabajas en el día.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Cuantas horas has trabajado hoy?");
        double horasWorking = keyboard.nextDouble();
        //Preguntar por el salario/hora.
        System.out.println("¿Cuanto cobras a la hora?");
        double salarioDia = keyboard.nextDouble();

        System.out.println("Tu salario de hoy corresponde a "+horasWorking * salarioDia);

        keyboard.close();

    }
}
