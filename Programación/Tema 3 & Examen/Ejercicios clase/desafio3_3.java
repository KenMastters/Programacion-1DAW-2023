import java.util.Scanner;

public class desafio3_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce numero 1: ");
        int numero1 = keyboard.nextInt();

        System.out.println("Introduce numero 2: ");
        int numero2 = keyboard.nextInt();
     
        if(numero1 < numero2) {
            System.out.println("numero1 es menor que numero2");
           }
           else if( numero1 == numero2 ) {
            System.out.println("numero1 y numero2 son iguales");
           }
           else {
            System.out.println("Numero1 es mayor que numero2");
           }
           keyboard.close();
    }
}
