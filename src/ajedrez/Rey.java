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

    public Rey(char color) {
        super(color);
    }
    
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
   
    @Override
    public String toString() {
        String pieza;
        if(color=='b'){
            pieza="\u2654 ";
        }else{
            pieza="\u265A ";
        }
        return pieza;
    }
}
