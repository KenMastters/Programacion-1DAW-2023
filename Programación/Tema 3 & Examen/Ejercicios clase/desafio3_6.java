import java.util.Scanner;

public class desafio3_6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Introduce numero1: ");
        int objetivo = keyboard.nextInt();
        int resultado = 1;
        
        for (int i = 1; i <= objetivo; i++) {
            resultado = resultado * i;
        }
            System.out.println(resultado);
            keyboard.close();
    }
}
