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
public class Neo extends Personaje{
     private boolean elegido;
    
    public Neo(){
        super();
        this.nombre="Neo";
        this.elegido=esElegido();
        
    }
    private boolean esElegido(){
        if((int)(Math.random()*2+1)==1){
            return true;
        }else{
             return false;
        }
    }

    /**
     * @return the elegido
     */
    public boolean isElegido() {
        return elegido;
    }

    /**
     * @param elegido the elegido to set
     */
    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }
    
    
}
