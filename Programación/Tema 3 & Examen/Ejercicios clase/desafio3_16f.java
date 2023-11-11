import java.util.Scanner;

public class desafio3_16f {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellidos");       

        String token = keyboard.nextLine();
        System.out.print(token.toUpperCase().charAt(0) + " ");


    keyboard.close();
    }
}
