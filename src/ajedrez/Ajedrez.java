/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * @author sancalsa
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //dos jugadores
        /*System.out.println("Elige un color \n"
                + "     1. Negra \n"
                + "     2. Blanca");
        int color = sc.nextInt();
        do{
            Juego jugador= new Juego(color);
        }while(color==1||color==0);*/
        
        
        //contra la maquina
        Juego juego = new Juego ('b');
        Tablero nuevo= new Tablero();
        nuevo.pintarTablero();
      
        boolean on=false;
        Movimiento mov =null;
        do{
            System.out.println("Que pieza quieres mover?\n"
                    + "*Ejemplo A1A3 = ficha A1 se mueve a casilla A3 (para terminar FIN)");
            String jugada= sc.nextLine();
            if (!jugada.equalsIgnoreCase("fin")){
                mov = juego.jugada(jugada, nuevo);
                if (mov!=null){ //significa que hay movimiento en cuanto al tablero
                    if (nuevo.tablero[mov.posInicial.fila][mov.posInicial.columna].validoMovimiento(mov)==true){//mov es valido pieza
                        //mover
                        nuevo.ponPieza(nuevo.tablero[mov.posInicial.fila][mov.posInicial.columna], mov.posFinal);//poner la pieza pos inicial en la final
                        nuevo.quitaPieza(mov.posInicial);//quitar la pieza de la pos inicial
                        //cambiar de turno
                        nuevo.pintarTablero();//pintar el Tablero
                    }else
                        System.out.println("Esa pieza no se mueve así");
                } 

            }else{
                on=true;
            }
        }while(on==false);
        
    }
    
}
