package Repaso;

public class Repaso_older {
    String nombre;
    int edad;

    public Repaso_older(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void compararEdad(Repaso_older OtraPersona) {
        if (this.edad > OtraPersona.edad) {
            System.out.println(this.nombre + " es mayor que " + OtraPersona.nombre);
        } else if (this.edad < OtraPersona.edad) {
            System.out.println(OtraPersona.nombre + " es mayor que " + this.nombre);
        } else {
            System.out.println(this.nombre + " y " + OtraPersona.nombre + " tienen la misma edad.");
        }
    }

    public static void main(String[] args) {
        Repaso_older persona_1 = new Repaso_older("Maria", 22);
        Repaso_older persona_2 = new Repaso_older("Jose", 22);

        persona_1.compararEdad(persona_2);
    }
}

// Create a new method to see if a person is older than other.
// The method should say who is older.
// The method should receive the second person as parameter.
