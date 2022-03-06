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
    private char color;

//CONSTRUCTORES
    /**
     * Constructor que inicializa el color de la pieza
     * @param color de la pieza que se le va a asignar
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
     * Metodo que permite obtener el color de la pieza
     * @return char del atributo color de la pieza
     */
    public char getColor() {
        return color;
    }
    
//METODOS
    /**
     * Metodo abstracto que obliga a todas las subclases de Pieza 
     * a crear un metodo que devuelva un boolean a partir de un movimiento
     * para saber si este es valido o no
     * @param mov
     * @return boolean del movimiento
     */
    public abstract boolean validoMovimiento(Movimiento mov);
    /**
     * Metodo que devuelve un string que contiene la primera letra de la pieza 
     * y el char de su atributo color
     * @return String de la pieza
     */
    public String pintarPieza() {
        return this.getClass().getSimpleName().charAt(0) + Character.toString(color);
    }
    /**
     * Metodo que obliga a todas las subclases a tener un metodo
     * que sobreescribe el metodo toString de la superclase Obeject
     * @return string de Pieza
     */
    @Override
    public abstract String toString() ;
    
}
