package bol4_3;

/**
 *
 * @author Leila
 */
public class Bol4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo obj = new Circulo(10);
        double area = obj.calcularArea();
        double longitud = obj.calcularLongitud();

        System.out.println("El circulo tiene un area de " + area + " y una longitud de " + longitud);
        
    }
    
}
