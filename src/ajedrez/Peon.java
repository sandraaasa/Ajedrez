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
public class Peon extends Pieza {

    /**
     * Constructor que permite la creacion de un objeto de clase Peon 
     * @param color de la pieza
     */
    public Peon(char color) {
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
        return mov.esVertical() || mov.esVertical();
    }
    
    /**
     * Metodo que permite sacar por pantalla la pieza dependiendo del atributo color que tenga esta
     * @return string del peon
     */
    @Override
    public String toString() {
        String pieza;
        if(super.getColor()=='b'){
            pieza="\u2659 ";
        }else{
            pieza="\u265F ";
        }
        return pieza;
    }
}
