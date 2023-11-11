import java.util.Scanner;

public class desafio3_16d {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i = 0;
        do {
            menuDesplegable();
            String introducido = keyboard.next().toLowerCase();
            
            if (introducido.charAt(0) == 'a') {
                System.out.println("Felicidades, has votado a the cool party (A)");
                System.exit(i);
            } else if (introducido.charAt(0) == 'b') {
                System.out.println("Felicidades, has votado a the angry party (B)");
                System.exit(i);

            } else if (introducido.charAt(0) == 'c') {
                System.out.println("Felicidades, has votado a the super crazy party (C)");
                System.exit(i);
            } else {
                System.out.println("Has elegido una opción que no existe, vuelve a intentarlo.\n");
            }
            
        } while (i < 1);
        keyboard.close();

    }

    public static void menuDesplegable() {
        System.out.println("*** Menú de votación ***");
        System.out.println("Introduce alguna de las opciones para enviar tu voto");
        System.out.println("Opción A - the cool party");
        System.out.println("Opción B - the angry party");
        System.out.println("Opción C - the supercrazy party");
        System.out.println("********************************");
    }
}
// There are elections to the president of the country. 
// There are 3 political parties: A “the cool party”, 
// B “the angry party” and C “the supercrazy party”.
// To vote, the user should enter (A, B or C) and we have
//  to print “You have voted for the XXXX party” (where XXXX is the name of the corresponding party).
// If the user enter an invalid option, print “invalid option” and ask again to the user for the vote.
// Example of execution:
// What party do you want to vote for?
// E
// Invalid option.
// What party do you want to vote for?
// F
// Invalid option.
// What party do you want to vote for?
// B
// You have voted for the angry party

