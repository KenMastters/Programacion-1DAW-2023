import java.util.Scanner;

public class desafio3_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un carácter para numero 1: ");
        int numero1 = keyboard.nextInt();
        System.out.println("Introduce un carácter para numero 2: ");
        int numero2 = keyboard.nextInt();

        if( numero1 >= 0) {
            System.out.println("numero2 es positivo");
          }
          if( !(numero1 > numero2) ) {
            System.out.println ("numero1 no es mayor que numero2");
          }
          if(numero1 < 0 && numero2 < 0) {
            System.out.println ("tanto numero1 como numero2 son negativos");
          }
          if(numero1 == 13 || numero2 == 13) {
            System.out.println ("numero1 es trece o numero2 es trece");
          }
          


        keyboard.close();
    }
}
