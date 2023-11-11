public class desafio2_2 {
    public static void main(String[] args) {
        int radioTierra = 6371;
        float alturaPersona = 1.70f;
        boolean lightsTurnedOn = false;
        String tallaCamisetas = "S, M, L o XL";
        final double pI = Math.PI; //El final indica que no se cambiará, que es una constante.
        int million = 1000000;
        long trllion = 1000000000000L;
        String password = "admin123";
        
        System.out.println("El radio de la tierra es: "+radioTierra);
        System.out.println("La altura de una persona promedio es: "+alturaPersona);
        System.out.println("¿Están las luces encendidas? "+lightsTurnedOn); 
        System.out.println("Las tallas disponibles son: "+tallaCamisetas);
        System.out.println("El número PI vale: "+pI);
        System.out.println("Numero 1 Millon: "+million);
        System.out.println("Numero 1 Billon: "+trillion);
        System.out.println("La contraseña de este dispositivo es: "+password);
    }
}
