import java.util.Scanner;

public class desafio3_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double a = keyboard.nextDouble();
        
        System.out.println("Introduce el segundo número");
        double b = keyboard.nextDouble();

        double resultado;
        resultado = a + b;
        System.out.println(a+"+"+b+"="+resultado);
        resultado = a - b;
        System.out.println(a+"-"+b+"="+resultado);
        resultado = a * b;
        System.out.println(a+"*"+b+"="+resultado);
        resultado = a / b;
        System.out.println(a+"/"+b+"="+resultado);
        resultado = a % b;
        System.out.println(a+"%"+b+"="+(int)resultado);
        keyboard.close();
    }
}
