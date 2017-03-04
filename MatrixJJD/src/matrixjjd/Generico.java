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
public class Generico extends Personaje{
     private int probabilidadDeMorir;
    public Generico(){
        super();
        this.probabilidadDeMorir=100;
        
    }

    /**
     * @return the probabilidadDeMorir
     */
    public int getProbabilidadDeMorir() {
        return probabilidadDeMorir;
    }

    /**
     * @param probabilidadDeMorir the probabilidadDeMorir to set
     */
    public void setProbabilidadDeMorir(int probabilidadDeMorir) {
        this.probabilidadDeMorir = probabilidadDeMorir;
    }
    
    
    
}
