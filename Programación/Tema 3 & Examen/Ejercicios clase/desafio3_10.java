import java.util.Scanner;

public class desafio3_10 {
    public static void main(String[] args) {

        int secret_number = (int)(Math.random()*10);
        Scanner keyboard = new Scanner(System.in);
        int introducido = -1;
        System.out.println("Se ha generado un numero random.");

        while (secret_number != introducido) {
            System.out.println("El número introducido no es el correcto");
            introducido = keyboard.nextInt();
        if (introducido < secret_number) {
            System.out.println("El numero introducido es menor al secreto");
        } else if (introducido > secret_number) {
            System.out.println("El numero introducido es mayor al secreto");

        } else {
         System.out.println("Has acercado el número!");
    }
}
    keyboard.close();
  }
}
