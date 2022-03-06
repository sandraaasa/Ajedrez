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
public class Torre extends Pieza{

    public Torre(char color) {
        super(color);
    }
    /**
     * 
     * @param mov
     * @return .
     */
    
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean on=false;
        if(mov.esVertical()||mov.esHorizontal()){
            on = true;
        }
        return on;
    }
    
    @Override
    public String toString() {
        String pieza;
        if(super.getColor()=='b'){
            pieza="\u2656 ";
        }else{
            pieza="\u265C ";
        }
        return pieza;
    }
    
}
