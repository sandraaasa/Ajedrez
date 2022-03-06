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
public class Alfil extends Pieza {

    public Alfil(char color) {
        super(color);
    }
    
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esDiagonal();
    }
    
   
    
    @Override
    public String toString() {
        String pieza;
        if(super.getColor()=='b'){
            pieza="\u2657 ";
        }else{
            pieza="\u265D ";
        }
        return pieza;
    }
    
}
