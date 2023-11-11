public class desafio2_3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        double resultado;
        resultado = a + b;

        System.out.println(a+"+"+b+"="+resultado);

        resultado = a - b;

        System.out.println(a+"-"+b+"="+resultado);

        resultado = a * b;

        System.out.println(a+"*"+b+"="+resultado);

        resultado = (double) a / b;

        System.out.println(a+"/"+b+"="+resultado);

        resultado = (double) a % b;

        System.out.println(a+"%"+b+"="+(int)resultado);

        System.out.println("El resultado de la suma es: "+ (a + b));
        System.out.println("El resultado de la resta es: "+ (a - b));
        System.out.println("El resultado de la multiplicacion es: "+ (a * b));
        System.out.println("El resultado de la división es: "+ (a / b));
    }
}
