/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * Subclase Torre de la clase Pieza
 * @author sancalsa
 * @version 6.3.2022
 */
public class Torre extends Pieza{

    /**
     * Constructor que permite la creacion de un objeto de clase Torre
     * @param color char del color de la pieza
     */
    public Torre(char color) {
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
        return mov.esVertical()||mov.esHorizontal();
    }
    
    /**
     * Metodo que permite sacar por pantalla la pieza dependiendo del atributo color que tenga esta
     * @return string de la torre
     */
    @Override
    public String toString() {
        String pieza;
        if(super.getColor()=='b'){
            pieza="\u2656";
        }else{
            pieza="\u265C";
        }
        return pieza;
    }
    
}
