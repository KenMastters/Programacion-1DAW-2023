import java.util.Scanner;

public class desafio3_16g {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Cual es tu número de telefono? (prefijo-numero-extension)");
        String numero = keyboard.next();

        Scanner sc = new Scanner(numero);

        sc.useDelimiter("-"); //Delimitamos a que vaya hasta el "-"
        String token;
        token = sc.next(); //Este es el prefijo que no lo queremos, por lo cual ni lo imprimimos.

        token=sc.next();
        System.out.println("Tu numero de telefono sin extensión es: "+token);


        sc.close();
        keyboard.close();
    }
}


// The phone number of a company has the next format: prefix-number-extension, 
// where prefix is the country code (i.e. +34), and the extension can have between 
// 2 and 4 digits. For example, this would be a number +34-968256541-33.
// Write a program asking for a phone number with this format and show on screen 
// the phone without the prefix nor the extension.
// Example of execution:
// Enter a phone number:
// +34-968123456-789
// The number without extension is:
// 968123456

