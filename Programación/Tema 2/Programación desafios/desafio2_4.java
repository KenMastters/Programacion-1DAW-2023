public class desafio2_4 {
    public static void main(String[] args) {
        //Este el precio inicial de toda la compra
        double precioInicial = 1000;
        //Cálculo para sumar el IVA
        double precioIVA = precioInicial * 1.21;
        //Variable para saber el total del cálculo
        double precioFinal = precioIVA;
        //Imprimirá el precio inicial de la compra por la pantalla
        System.out.println("Precio inicial: "+precioInicial);
        //Imprimira el precio final de la compra por la pantalla
        System.out.println("Precio con final: "+precioFinal);
        //Imprimirá el dinero que te suma equivalente al IVA
        System.out.println("Dinero añadido para el IVA: "+precioInicial * 0.21);
    }
}
