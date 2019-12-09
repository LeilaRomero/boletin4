package bol4_3;

/**
 *
 * @author Leila
 */
public class Circulo {
   
    private double radio, area, longitud;
    private final double pi = 3.1416;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        area = Math.pow(radio, radio);
        return area;
    }

    public double calcularLongitud() {
        longitud = 2 * pi * radio;
        return longitud;
    }

    public double setRadio() {
        return radio;
    }
    
}
