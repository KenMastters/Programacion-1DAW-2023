public class ejemplo1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        if ((a==5) && (b==5)) {
            System.out.println("No se va a mostrar1");
         } else {
            System.out.println("Esto no debería de verte :)");
         }
         if ((a==5) || (b==5)) {
            System.out.println("Esto si se muestra2");
         } 
         if (!(b==5)) {
            System.out.println("Esto si se muestra3");
         }
    }
}
