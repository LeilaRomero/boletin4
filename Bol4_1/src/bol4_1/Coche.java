package bol4_1;

/**
 *
 * @author Leila
 */
public class Coche {

    private int velocidad;

    public Coche() {
        velocidad = 0;
    }

    public void acelerar(int valor) {
        velocidad = velocidad + valor;
    }

    public void frenar(int menos) {
        velocidad = velocidad - menos;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
