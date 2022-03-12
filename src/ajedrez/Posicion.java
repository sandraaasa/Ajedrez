/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * clase Posicion
 * @author sancalsa
 * @version 6.3.2022
 */
public class Posicion {

//ATRIBUTOS

    int fila, columna;
    

//CONSTRUCTORES

    /**
     * Constructor que permite la creacion de un objeto de tipo Posicion
     * con los atributos fila y columna personalizados 
     * @param fila numero entero de la Posicion
     * @param columna numero entero de la Posicion
     */
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    /**
     * Constructor que permite la creacion de un objeto de tipo Posicion
     * con los atributos fila y columna inicializados a 0
     */
    public Posicion() {
        fila=0;
        columna=0;
    }

//GETTER

    /**
     * Metodo que permite obtener la fila de la posicion
     * @return int del atributo fila de la posicion
     */
    public int getFila() {
        return fila;
    }
    /**
     * Metodo que permite obtener la columna de la posicion
     * @return int del atributo columna de la posicion
     */
    public int getColumna() {
        return columna;
    }
    
//SETTER
        
    /**
     * Metodo que permite cambiar el atributo fila por el numero entero que recibe el metodo
     * @param fila numero entero asignado a fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }
    /**
     * Metodo que permite cambiar el atributo columna por el numero entero que recibe el metodo
     * @param columna numero entero con el valor nuevo
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

//METODOS

    /**
     * Metodo que permite comprobar que la fila y la columna estan dentro del limite del tablero
     * @param fila de la posicion
     * @param columna de la posicion
     * @return boolean que indica si esta dentro del limite o no
     */
    public boolean limite (int fila, int columna){
        boolean on =false;
        if ((fila>=0 && fila<=7) 
            && (columna>=0 && columna<=7)) {
            on=true;
        }
        return on;
    }
    /**
     * Metodo que sobreescribe el metodo toString de la clase Objeto para 
     * que se muestren los atributos de la clase posicion separados por una coma
     * @return string de la posicion
     */
    @Override
    public String toString() {
        //return "Posicion{" + "fila=" + fila + ", columna=" + columna + '}';
        return fila +","+ columna;
    }
    
    
    
}
