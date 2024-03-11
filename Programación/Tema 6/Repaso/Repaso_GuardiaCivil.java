package Repaso;

public class Repaso_GuardiaCivil {
    String nombre;
    int edad;
    int altura;

    public Repaso_GuardiaCivil(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public boolean EsApto() {
        boolean apto = false;
        if (altura >= 160) {
            apto = true;
        }
        return apto;
    }

    public String toString() {
        String persona; // Para añadirle el final de si es o no es apto.
        persona = nombre + " con " + edad + " años" + " y " + altura + " cms de altura";
        if (this.EsApto()) {
            persona = persona + " puede ser guardia civil.";
        } else {
            persona = persona + " no puede ser guardia civil.";
        }
        return persona;
    }

    public static void main(String[] args) {
        Repaso_GuardiaCivil intento_1 = new Repaso_GuardiaCivil("Juanito", 35, 130);
        Repaso_GuardiaCivil intento_2 = new Repaso_GuardiaCivil("Manolo", 23, 180);

        System.out.println(intento_1);
        System.out.println(intento_2);
    }

}

// Puedes convertirte en Guardia Civil si mides 160 cms o más.
// Modifica la clase persona para almacenar la altura de una persona
// y crea un nuevo método que decida si una persona puede ser “Guardia Civil”.
// El método debería devolver un valor booleano.
