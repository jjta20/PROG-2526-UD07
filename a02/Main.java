package a02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HoraExacta reloj = new HoraExacta(11, 15, 23); 
        System.out.println(reloj);
        
        for (int i = 1; i <= 61; i++) {
            reloj.inc();
        }        
        System.out.println(reloj);
        
        System.out.println("Escriba los segundos: ");        
        int segundos = new Scanner(System.in).nextInt();
        
        if (reloj.setSegundos(segundos)) {
            System.out.println(reloj);
        } else {
            System.out.println("No es posible cambiar los segundos");
        }
    }

}
