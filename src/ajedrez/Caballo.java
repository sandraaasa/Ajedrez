/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * Subclase Caballo de la clase Pieza
 * @author sancalsa
 * @version 6.3.2022
 */
public class Caballo extends Pieza {

    /**
     * Constructor que permite la creacion de un objeto de clase Caballo 
     * @param color char del color de la pieza
     */
    public Caballo(char color) {
        super(color);
    }
    
    /**
     * Metodo que devuelve un boolean a partir de un movimiento
     * para saber si este es valido o no
     * @param mov Movimiento de la pieza
     * @return boolean del movimiento
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        //modificar, hacer control
        boolean on = false;
        if ((Math.abs(mov.saltoHorizontal())==1 && Math.abs(mov.saltoVertical())==2)
                || (Math.abs(mov.saltoHorizontal())==2 && Math.abs(mov.saltoVertical())==1)) {
            on=true;
        }
        return on;
    }
    
    /**
     * Metodo que permite sacar por pantalla la pieza dependiendo del atributo color que tenga esta
     * @return string del caballo
     */
    /*@Override
    public String toString() {
        String pieza;
        if(super.getColor()=='b'){
            pieza="\u2658";
        }else{
            pieza="\u265E";
        }
        return pieza;
    }*/
}
