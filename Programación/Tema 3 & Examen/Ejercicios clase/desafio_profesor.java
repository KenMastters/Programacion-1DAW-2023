import java.util.Scanner;

public class desafio_profesor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*******************************************");
        System.out.println("*** ¡BIENVENIDO AL MENÚ DE PROGRAMACIÓN ***");
        System.out.println("* - Tienes 2 opciones disponibles **");
        System.out.println("* - 1 Calcular área y mostrarla **");
        System.out.println("* - 2 Calcular perimetro y mostrarla **");
        System.out.println("* - (Vacio) Salir **");
        System.out.println("*******************************************");
        int eleccion = keyboard.nextInt();

        if (eleccion == 1) {
            System.out.println("Dime el área que quieres calcular (numero)");
            int area = keyboard.nextInt();
            System.out.println("El área de "+area+" es "+calcularArea(area));
        } else if (eleccion == 2) {
            System.out.println("Dime el perimetro que quieres calcular (numero)");
            int perimetro = keyboard.nextInt();
            System.out.println("El área de "+perimetro+" es "+calcularPerimetro(perimetro));

        } else {
            System.out.println("No has elegido nada por lo cual, se termina el programa.");
        }
        keyboard.close();
        
}

    public static int calcularArea(int lado) {
        int area = lado * lado;
        return(area);
    }

    public static int calcularPerimetro(int lado) {
        int perimetro = lado + lado;
        return(perimetro);
    }


}
