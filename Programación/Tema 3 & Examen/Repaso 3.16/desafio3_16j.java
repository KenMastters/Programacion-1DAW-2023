import java.util.Scanner;

public class desafio3_16j {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Cual es tu lista de la compra?");
        String lista = keyboard.nextLine();
        
        
        Scanner sc = new Scanner(lista); //Declaramos otro sc para trabajar sobre la lista
        while (sc.hasNext()) {
        sc.useDelimiter("\\,"); //Delimitado r
        String token; //Token que recuperaremos
        token = sc.next();
        System.out.println(token.trim()); //Añadimos trim para eliminar los espacios en blanco al final.
        }

        sc.close();
        keyboard.close();
    }
}

// j. [ADVANCED] Shopping list.
// The user have to introduce by keyboard the list of products in a shopping list separated by
// commas.
// Show each product in a different line.
// Example of execution:
// Enter the shopping list:
// bananas,tomato,chocolate,pizza
// Shopping list with each product in different line:
// bananas
// tomato
// chocolate
// pizza