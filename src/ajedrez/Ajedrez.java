/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * Clase Ajedrez qie contiene el main del ajedrez
 * @author sancalsa
 * @version 6.3.2022
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //dos jugadores
        System.out.println("Color del jugador 1\n"
                + "     1. Negra \n"
                + "     2. Blanca");
        int color = sc.nextInt();
        char juega;
        if (color==1) {
            juega='n';
        }else
            juega='b';
        Juego juego = new Juego (juega);
        System.out.println("Empieza el jugador 1: "+ juega);
        Tablero nuevo= new Tablero();
      
        boolean on=false;
        Movimiento mov =null;
        sc.nextLine();
        do{
            nuevo.pintarTablero();
            System.out.println("Que pieza quieres mover?\n"
                    + "*Ejemplo A1A3 = ficha A1 se mueve a casilla A3 (para terminar FIN)");
            String jugada= sc.nextLine();
            if (!jugada.equalsIgnoreCase("fin")){
                mov = juego.jugada(jugada, nuevo);
                if (mov!=null){ //significa que hay movimiento en cuanto al tablero
                    if (nuevo.tablero[mov.posInicial.fila][mov.posInicial.columna].validoMovimiento(mov,nuevo)==true){//mov es valido pieza
                        //mover
                        //comprobar que no hay pieza entre del mismo color si no es un caballo
                        //y si la hay y es del mismo color poner pieza y quitar pieza que esta en esa posicion /*o*/ dar un error diciendo que ahi o puede colocarla o que se debe comer esa pieza 
                        nuevo.ponPieza(nuevo.tablero[mov.posInicial.fila][mov.posInicial.columna], mov.posFinal);//poner la pieza pos inicial en la final
                        nuevo.quitaPieza(mov.posInicial);//quitar la pieza de la pos inicial
                        if (juego.getTurno()=='b') {
                            juego.setTurno('n');
                            on=false;
                        }else 
                        on=false;
                    }else{
                        System.out.println("Esa pieza no se mueve así");
                        on=false;
                    }
                }else{
                    System.out.println("Ese movimiento no existe");
                    on=false;
                }

            }else{
                on=true;
            }
        }while(on==false);
        
    }
    
}
