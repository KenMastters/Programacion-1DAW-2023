import java.util.Scanner;

public class desafio3_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Cuántas horas has trabajado?");
        double horas = keyboard.nextDouble();
        System.out.println("¿Cuánto cobras la hora?");
        double dinerohora = keyboard.nextDouble();
        double salario = horas * dinerohora;

        System.out.println("¡Tu salario total es de: "+salario+"!");
        

        keyboard.close();


    }
}
