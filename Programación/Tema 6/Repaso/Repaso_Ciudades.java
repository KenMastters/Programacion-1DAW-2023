package Repaso;

public class Repaso_Ciudades {
    String nombre;
    String pais;
    int habitantes;

    public Repaso_Ciudades(String nombre, String pais, int habitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return nombre + " es de " + pais + " y cuenta con " + habitantes + "habitantes.";
    }

    public static void main(String[] args) {
        Repaso_Ciudades ciudades_1 = new Repaso_Ciudades("Madrid", "España", 140595);

        System.out.println(ciudades_1);
    }
}

// Crea una nueva clase para almacenar ciudades.
// Almacena el nombre, el país y el número de habitantes.
// Crea un constructor para esta clase.
// Crea 2 ciudades (objetos que pertenecen a esta clase).
// Imprime cada una de estas ciudades (de una manera bonita).