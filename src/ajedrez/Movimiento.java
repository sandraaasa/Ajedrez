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

//ATRIBUTOS
 
   protected Posicion posInicial;
   protected Posicion posFinal;
 
//CONSTRUCTORES
  
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
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        if ((posInicial.columna>=0 && posInicial.columna<=7)&&
            (posInicial.fila>=0 && posInicial.fila<=7) &&
            (posFinal.columna>=0 && posFinal.columna<=7) &&
            (posFinal.fila>=0&&posFinal.fila<=7)){
            
                this.posInicial = posInicial;
                this.posFinal = posFinal;
        }
    }

//METODOS

    /**
     * Metodo que permite conocer si el movimiento es vertical 
     * @return boolean del movimiento vertical
     */
    public boolean esVertical (){
        boolean on = false;
        if (posInicial.getColumna()==posFinal.getColumna()){
            on=true;
        }
        return on;
    }
    /**
     * Metodo que permite conocer si el movimiento es vertical
     * @return boolean del movimiento horizontal
     */
    public boolean esHorizontal(){
        boolean on = false;
        if (posInicial.getFila()==posFinal.getFila()){
            on=true;
        }
        return on;
    }
    /**
     * Metodo que permite conocer si el movimiento es horizontal
     * @return boolean del movimiento vertical
     */
    public boolean esDiagonal (){
        boolean on = false;
        if (posInicial.getFila()!=posFinal.getFila()&&posInicial.getColumna()!=posFinal.getColumna()){
            on=true;
        }
        return on;
    }
    /**
     * Metodo que devuelve la cantidad de posiciones avanzadas
     * @return numero entero dde la cantidad de posiciones saltadas
     */
    public int saltoVertical(){
        return posInicial.getFila()-posFinal.getFila();
    }
    /**
     * Metodo que devuelve la cantidad de posiciones avanzadas
     * @return numero entero dde la cantidad de posiciones saltadas 
     */
    public int saltoHorizontal(){
        return posInicial.getColumna()-posFinal.getColumna();
    }
}
