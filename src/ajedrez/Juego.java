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
public class Juego {
    private char turno;

//Constructor
    /**
     * Constructor que permite la creacion de un objeto de tipo Juego con
     * el atributo turno personalizao
     * @param turno char con el turno
     */
    public Juego(char turno) {
       this.turno =turno;
    }

//getter y setter
    /**
     * Metodo que permite obtener el turno
     * @return char del turno
     */
    public char getTurno(){return turno;}
    /**
     * Metodo que permite modificar el turno
     * @param turno char con el nuevo turno
     */
    public void setTurno(char turno) {this.turno = turno;}

//Metodos
    /**
     * Metodo que convierte el string de la jugada a un movimiento
     * que el programa pueda leer
     * @param jugada introducida como string por el jugador
     * @param tablero Tablero en el que se esta jugando
     * @return movimiento de la jugada
     */
    public Movimiento jugada (String jugada, Tablero tablero){
        Movimiento mov= null;
        jugada = jugada.toUpperCase(); //a2A3->A2A3
        int fInicial = jugada.charAt(1)-49;
        int fFinal = jugada.charAt(3)-49;
        int cInicial = jugada.charAt(0)-65;
        int cFinal = jugada.charAt(2)-65;
        
        if (validarJugada(fInicial,fFinal,cInicial, cFinal, tablero)==true){
            Posicion posInicial = new Posicion(fInicial,cInicial);
            Posicion posFinal = new Posicion(fFinal,cFinal);
            mov = new Movimiento(posInicial,posFinal);
        }
        
        return mov;
    };
    /**
     * Metodo que nos permite saber si la jugada es valida o no
     * @param fInicial numero entero de la posicion inicial
     * @param fFinal numero entero de la posicion inicial
     * @param cInicial numero entero de la posicion final
     * @param cFinal numero entero de la posicion final
     * @param tablero Tablero en el que se esta jugando
     * @return boolean de la jugada introducida para validar
     */
     public boolean validarJugada (int fInicial,int fFinal,int cInicial,int cFinal, Tablero tablero){
        boolean on= false;
        if (tablero.tablero[fFinal][cFinal]==null) {
            on=true;
        }else{
            if (tablero.tablero[fFinal][cFinal].getColor()==tablero.tablero[fInicial][cInicial].getColor()){
                on=false;
            }else{
                on=true;
            }
        }
         
        return on;
     }
 
}
