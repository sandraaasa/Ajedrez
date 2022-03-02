/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author sancalsa
 */
public class Movimiento {
/**
 * ATRIBUTOS
 */
   protected Posicion posInicial;
   protected Posicion posFinal;
 /**
  * CONSTRUCTORES
  */
    /**
     * Constructor que permite la creacion de un objeto de tipo Movimiento con posicion 0,0
     */
    public Movimiento() {
        posInicial.columna=0;
        posInicial.fila=0;
        posFinal.columna=0;
        posFinal.fila=0;
        
    }
    /**
     * Constructor que permite la creacion de un objeto de tipo Movimiento con posicion inicial y final personalizada
     * @param posInical
     * @param posFinal 
     */
    public Movimiento(Posicion posInical, Posicion posFinal) {
        if ((posInicial.columna>=0 || posInicial.columna<=7)&&
            (posInicial.fila>=0 || posInicial.fila<=7) &&
            (posFinal.columna>=0|| posFinal.columna<=7) &&
            (posFinal.fila>=0||posFinal.fila<=7)){
            
                this.posInicial = posInical;
                this.posFinal = posFinal;
        }
    }
/**
 * METODOS
 */
    /**
     * 
     * @return 
     */
    public boolean esVertical (){
        boolean on = false;
        if (posInicial.getColumna()==posFinal.getColumna()){
            on=true;
        }
        return on;
    }
    public boolean esHorizontal(){
        boolean on = false;
        if (posInicial.getFila()==posFinal.getFila()){
            on=true;
        }
        return on;
    }
    // REVISAR
    public boolean esDiagonal (){
        boolean on = false;
        if (posInicial.getFila()!=posFinal.getFila()&&posInicial.getColumna()!=posFinal.getColumna()){
            on=true;
        }
        return on;
    }
    public int saltoVertical(){
        return posInicial.getFila()-posFinal.getFila();
    }
    public int saltoHorizontal(){
        return posInicial.getColumna()-posFinal.getColumna();
    }
}
