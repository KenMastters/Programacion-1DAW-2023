import java.util.Scanner;

public class desafio3_16b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime numero 1");
        int numero1 = keyboard.nextInt();

        System.out.println("Dime numero 2");
        int numero2 = keyboard.nextInt();

        System.out.println("Dime numero 3");
        int numero3 = keyboard.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es numero 1 con: "+numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El mayor es numero 2 con: "+numero2);
            
        } else {
            System.out.println("El mayor es numero 3 con: "+numero3);
        }
        keyboard.close();
    }
}
