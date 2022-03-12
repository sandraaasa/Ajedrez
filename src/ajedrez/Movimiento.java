/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * Clase Movimiento
 * @author sancalsa
 * @version 6.3.2022
 */
public class Movimiento {

//ATRIBUTOS
    /**
     * Atributo protegido posicion inicial de movimiento compuesto por una fila y una columna
     */
    protected Posicion posInicial;
    /**
     * * Atributo posicion final de movimiento compuesto por una fila y una columna
     */
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
     * @param posInicial Posicion del Movimiento
     * @param posFinal Posicion del Movimiento
     */
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        if (posInicial.limite(posInicial.fila,posInicial.columna)&&
            posFinal.limite(posFinal.fila,posFinal.columna)){
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
     * @return boolean del movimiento diagonal
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

    /**
     * Metodo que devuelve el string del movimiento
     * @return string del Movimmiento
     */
    @Override
    public String toString() {
        return "Movimiento{" + "posInicial=" + posInicial + ", posFinal=" + posFinal + '}';
    }
    
    
}
