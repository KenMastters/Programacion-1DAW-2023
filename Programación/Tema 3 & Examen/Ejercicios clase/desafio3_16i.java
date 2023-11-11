import java.util.Scanner;

public class desafio3_16i {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime una cantidad de euros");
        String cantidad = keyboard.nextLine();
        keyboard.useDelimiter(",");
        int entero;
        int decimal;

        while (keyboard.hasNext()) {
            cantidad = keyboard.next();
            System.out.println(cantidad);
        }
    }
}
