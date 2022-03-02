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
public class Dama extends Pieza {

    public Dama(char color) {
        super(color);
    }
    
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal()|| mov.esDiagonal();
    }
    
    
    @Override
    public String toString() {
        String pieza;
        if(color=='b'){
            pieza="\u2655 ";
        }else{
            pieza="\u265B ";
        }
        return pieza;
    }
}
