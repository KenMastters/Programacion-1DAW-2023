package Repaso;

import java.text.DecimalFormat;

public class Repaso_Circulo {
    double radio;
    static int total_circulos;

    public Repaso_Circulo(double radio) {
        this.radio = radio;
        total_circulos++;
    }

    public double calcularPerimetro() {
        return (2 * Math.PI * radio);
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Total de circulo antes de crear: " + Repaso_Circulo.total_circulos);
        Repaso_Circulo circulo_1 = new Repaso_Circulo(3);
        Repaso_Circulo circulo_2 = new Repaso_Circulo(4);
        System.out.println("Total de circulo despues de crear: " + Repaso_Circulo.total_circulos);
        System.out.println("El perimetro de circulo 1 es " + formato.format(circulo_1.calcularPerimetro()));
        System.out.println("El área de circulo 1 es: " + formato.format(circulo_1.calcularArea()));
        System.out.println("El perimetro de circulo 2 es " + formato.format(circulo_2.calcularPerimetro()));
        System.out.println("El área de circulo 2 es: " + formato.format(circulo_2.calcularArea()));
    }
}

// Crea una clase para almacenar círculos.
// Un círculo está definido por su radio.
// Crea 2 círculos con radio 3 y con radio 4.
// Imprima el número total de círculos antes de crear cualquier círculo y
// después de crear los círculos.
// Crea un método para calcular el perímetro del círculo y un método para
// calcular el área del círculo.
// Para el círculo de radio 3 el área debe ser 28,27 y el perímetro 18,85, y
// para el círculo de radio 4
// el área debe ser 50,27 y el perímetro 25,13.