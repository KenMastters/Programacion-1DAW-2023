import java.util.Scanner;

public class ejemplo_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Dime un carácter para A: ");
        String a = keyboard.next();
        System.out.println("Dime un carácter para B: ");
        String b = keyboard.next();
        System.out.println("Estas introducido estas variables en A y B:");
        System.out.println(a);
        System.out.println(b);

        keyboard.close();
        
    }
}
