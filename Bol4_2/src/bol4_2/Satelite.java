package bol4_2;

/**
 *
 * @author Leila
 */
public class Satelite {
  
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;

    public Satelite() {

        meridiano = paralelo = distanciaTierra = 0;
    }

    public Satelite(double merid, double paral, double distancia) {

        meridiano = merid;
        paralelo = paral;
        distanciaTierra = distancia;

    }

    public void verPosicion() {

        System.out.println("O satelite atopase no paralelo " + paralelo + ", meridiano " + meridiano + ", a unha distancia da terra " + distanciaTierra);

    }
    
}
