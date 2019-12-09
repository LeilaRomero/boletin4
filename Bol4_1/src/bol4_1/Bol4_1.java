package bol4_1;

import java.util.Scanner;

/**
 *
 * @author Leila
 */
public class Bol4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Coche obj = new Coche();
        int acelero = leer.nextInt();
        int freno = leer.nextInt();
        int velocidad = obj.getVelocidad();
        System.out.println("Velocidad = " + velocidad);
        obj.acelerar(acelero);
        int velocidad1 = obj.getVelocidad();
        System.out.println("Velocidad = " + velocidad1);
        obj.frenar(freno);
        int velocidad2 = obj.getVelocidad();
        System.out.println("Velocidad = " + velocidad2);
    }

}
