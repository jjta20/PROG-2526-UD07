package a01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hora reloj = new Hora(11, 30); //las 11:30
        System.out.println(reloj);
        
        for (int i = 1; i <= 61; i++) { //incrementamos 61 minutos
            reloj.inc();
        }        
        System.out.println(reloj); //mostramos
        
        System.out.println("Modifica la hora: ");
        int nuevaHora = new Scanner(System.in).nextInt();
        
        if (reloj.setHora(nuevaHora)) { //cambiamos la nuevaHora
            System.out.println(reloj);
        } else {
            System.out.println("La hora no se pudo cambiar");
        }
    }

}
