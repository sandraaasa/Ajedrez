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

    public Peon(char color) {
        super(color);
    }
    
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esVertical();
    }
   
    
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
