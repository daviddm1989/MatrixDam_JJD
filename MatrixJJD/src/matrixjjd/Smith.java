/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixjjd;

/**
 *
 * @author david
 */
public class Smith extends Personaje{
    
      private int capacidadInfectar;
    public Smith(){
        super();
        this.nombre="Smith";
        this.capacidadInfectar=(int)(Math.random()*8+1);
    }

    /**
     * @return the capacidadInfectar
     */
    public int getCapacidadInfectar() {
        return capacidadInfectar;
    }

    /**
     * @param capacidadInfectar the capacidadInfectar to set
     */
    public void setCapacidadInfectar(int capacidadInfectar) {
        this.capacidadInfectar = capacidadInfectar;
    }
    
}
