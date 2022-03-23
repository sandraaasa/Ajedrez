/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * Subclase Peon de la clase Pieza
 *
 * @author sancalsa
 * @version 6.3.2022
 */
public class Peon extends Pieza {

    /**
     * Constructor que permite la creacion de un objeto de clase Peon
     *
     * @param color char del color de la pieza
     */
    public Peon(char color) {
        super(color);
    }

    /**
     * Metodo que devuelve un boolean a partir de un movimiento para saber si
     * este es valido o no
     *
     * @param mov Movimiento de la pieza
     * @return boolean del movimiento
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean on = false;
        /*if (tablero.DevuelvePieza(mov.posInicial).getColor() == 'b') {
            if (mov.posInicial.fila == 6 && mov.esVertical() && mov.saltoVertical() == -1 || mov.saltoVertical() == -2) {
                on = true;
            } else {
                if (mov.esVertical() && mov.saltoVertical() == -1 && tablero.hayPieza(mov.posFinal) == false) {
                    on = true;
                } else {
                    if (mov.esDiagonal() && mov.saltoVertical() == -1 && tablero.hayPieza(mov.posFinal) == true) {
                        on = true;
                    }
                }
            }
        } else {*/
            if ((mov.posInicial.fila == 1||mov.posInicial.fila == 6) 
                    && mov.esVertical() 
                    && Math.abs(mov.saltoVertical()) == 1 || Math.abs(mov.saltoVertical())== 2) {
                on = true;
            } else {
                if (mov.esVertical() && Math.abs(mov.saltoVertical()) == 1 && tablero.hayPieza(mov.posFinal) == false) {
                    on = true;
                } else {
                    if (mov.esDiagonal() && Math.abs(mov.saltoVertical()) == 1 && tablero.hayPieza(mov.posFinal) == true) {
                        on = true;
                    }
                }
            }
        //}
        return on;
    }

    /**
     * Metodo que permite sacar por pantalla la pieza dependiendo del atributo
     * color que tenga esta
     *
     * @return string del peon
     */
    /*@Override
    public String toString() {
        String pieza;
        if (super.getColor() == 'b') {
            pieza = "\u2659";
        } else {
            pieza = "\u265F";
        }
        return pieza;
    }*/
}
