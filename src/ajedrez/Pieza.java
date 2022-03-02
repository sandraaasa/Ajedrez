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
public abstract class Pieza {
//ATRIBUTOS
    protected char color;

//CONSTRUCTORES
    /**
     * Inicaliza el color a blanco o a negro segun lo introducido
     * //realizar control de entrada solo una b(blanco) o una n(negro)
     * @param color 
     */
    public Pieza(char color) {
        if (color=='b'||color=='B'){
            this.color='b';
        }else{
            if(color=='N'||color=='n')
                this.color='n';
        }
    }

//GETTER
    /**
     * @return 
     */
    public char getColor() {
        return color;
    }
    
//METODOS
    /**
     * 
     * @param mov
     * @return 
     */
    public abstract boolean validoMovimiento(Movimiento mov);
    
    public String pintarPieza() {
        return this.getClass().getSimpleName().charAt(0) + Character.toString(color);
    }

    @Override
    public abstract String toString() ;
    
}
