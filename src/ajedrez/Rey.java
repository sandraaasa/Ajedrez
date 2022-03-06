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
public class Rey extends Pieza {

    /**
     * Constructor que permite la creacion de un objeto de clase Rey
     * @param color de la pieza
     */
    public Rey(char color) {
        super(color);
    }
    
    /**
     * Metodo que devuelve un boolean a partir de un movimiento
     * para saber si este es valido o no
     * @param mov de pieza que es un movimiento
     * @return boolean del movimiento
     */
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean on=false;
        if(mov.esVertical() || mov.esHorizontal()||mov.esDiagonal()){
            on = true;
        }
        /*if(mov.saltoVertical()==1||mov.saltoVertical()==-1||mov.saltoVertical()==1||mov.saltoVertical()==-1){
            on=true;
        }*/
        return on;
    }
    
    /**
     * Metodo que permite sacar por pantalla la pieza dependiendo del atributo color que tenga esta
     * @return string del rey
     */
    @Override
    public String toString() {
        String pieza;
        if(super.getColor()=='b'){
            pieza="\u2654 ";
        }else{
            pieza="\u265A ";
        }
        return pieza;
    }
}
