import java.util.Scanner;

public class desafio3_16h {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = keyboard.nextLine();
        String vocalStr;
        char vocal;


        do {
            System.out.println("Dime una vocal");
            vocalStr = keyboard.next();
            vocal = vocalStr.charAt(0);

        } while (vocal != 'a' &&  vocal != 'e');

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == vocal) {
                System.out.print(Character.toUpperCase(vocal));
            } else {
                System.out.print(frase.charAt(i));
            }
        }

        keyboard.close();
    }
}
