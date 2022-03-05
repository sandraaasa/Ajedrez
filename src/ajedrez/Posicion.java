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
public class Posicion {
/**
 * ATRIBUTOS
 */
    int fila, columna;
    
/**
 * CONSTRUCTORES
 */
    /**
     * 
     * @param fila
     * @param columna 
     * Inicializa fila y columna a los valores que recibe el constructor
     */
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    /**
     * Inicializa la posición a 0
     * El atributo columna y fila estan a 0
     */
    public Posicion() {
        fila=0;
        columna=0;
    }
    
/**
 * GETTER
 */
    /**
     * 
     * @return 
     */
    public int getFila() {
        return fila;
    }
    /**
     * 
     * @return 
     */
    public int getColumna() {
        return columna;
    }
    
/*
 * SETTER
 */
    /**
     * 
     * @param fila 
     */
    public void setFila(int fila) {
        this.fila = fila;
    }
    /**
     * 
     * @param columna 
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

/**
 * METODOS
 */
    /**
     *
     * @return 
     */
    @Override
    public String toString() {
        //return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
        return fila +","+ columna;
    }
    
    
    
}
