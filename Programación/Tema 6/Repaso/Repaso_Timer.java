package Repaso;

public class Repaso_Timer {
    int horas;
    int minutos;
    int segundos;

    public Repaso_Timer(int segundos) {
        convertidor(segundos);
    }

    public void convertidor(int seconds) {
        horas = seconds / 3600;
        minutos = (seconds - (horas * 3600)) / 60;
        segundos = seconds - (horas * 3600) - (minutos * 60);
    }

    @Override
    public String toString() {
        return "Convertidor: Horas = " + horas + ", Minutos = " + minutos + ", Segundos = " + segundos;
    }

    public static void main(String[] args) {
        Repaso_Timer convertidor_1 = new Repaso_Timer(1843056);
        Repaso_Timer convertidor_2 = new Repaso_Timer(1231415);
        Repaso_Timer convertidor_3 = new Repaso_Timer(12948);
        Repaso_Timer convertidor_4 = new Repaso_Timer(129381519);

        System.out.println(convertidor_1);
        System.out.println(convertidor_2);
        System.out.println(convertidor_3);
        System.out.println(convertidor_4);
    }
}

// Cree un método que convierta una cantidad de segundos en horas, minutos y
// segundos.
// Por ejemplo:
// int horas = totalSegundos / 3600;
// int segundos restantes = total de segundos - (horas * 3600);
// int minutos = segundos restantes / 60;
// int segundos = segundos restantes - (minutos * 60);
// Ahora crea un objeto para almacenar horas, minutos y segundos.
// Cree el método para devolver un objeto de este tipo.
// Tome el objeto devuelto por el método e imprímalo en pantalla (tendría que
// crear el método toString).