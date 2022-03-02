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

    public Juego(char turno) {
       this.turno =turno;
    }
    
    public int getTurno(){return turno;}
    public void setTurno(char turno) {this.turno = turno;}
    public Movimiento jugada (String jugada, Tablero tablero){
        Movimiento mov= null;
        jugada = jugada.toUpperCase(); //a2A3->A2A3
        int fInicial = jugada.charAt(1)-49;
        int fFinal = jugada.charAt(3)-49;
        int cInicial = jugada.charAt(0)-65;
        int cFinal = jugada.charAt(2)-65;
        
        if (validarJugada(fInicial,fFinal,cInicial, cFinal, tablero)==false){
            Posicion posInicial = new Posicion(fInicial,cInicial);
            Posicion posFinal = new Posicion(fFinal,cFinal);
            mov = new Movimiento(posInicial,posFinal);
        }
        
        return mov;
    };
     public boolean validarJugada (int fInicial,int fFinal,int cInicial,int cFinal, Tablero tablero){
         //Ej: A2A3
         boolean on= false;
         //int filaInicial = 
         
         return on;
     }
 
}
