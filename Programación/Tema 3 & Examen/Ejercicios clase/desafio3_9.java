import java.util.Scanner;

public class desafio3_9 {
    public static void main(String[] args) {
        int secret_number = (int)(Math.random()*10);

        Scanner keyboard = new Scanner(System.in);
        
        int introducido = keyboard.nextInt();


        while (secret_number != introducido) {
            
            System.out.println("¿Cual es el numero secreto?");
            
            if (secret_number == introducido) {
                System.out.println("Has acertado el numero secreto");
            }
            else if (secret_number < introducido){
                System.out.println("<");

            } else {
                System.out.println(">");
            }
        }

    keyboard.close();
    
}

    
}
