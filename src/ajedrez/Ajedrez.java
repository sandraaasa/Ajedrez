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
        String jugador;
        if (color==1) {
            juega='n';
        }else
            juega='b';
        Juego juego = new Juego (juega);
        if (color==2) {
            jugador="blancas";
        } else {
            jugador="negras";
        }
        System.out.println("Empieza las "+ jugador+"\n");
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
                if (juego.getTurno()!=juega) {
                    System.out.println("No es tu turno. Es el turno de :\n"
                            + "   "+jugador.toUpperCase());
                }else{
                    mov = juego.jugada(jugada, nuevo);
                    if (mov!=null){ //significa que hay movimiento en cuanto al tablero
                        if (nuevo.tablero[mov.posInicial.fila][mov.posInicial.columna].validoMovimiento(mov,nuevo)==true){//mov es valido pieza
                            nuevo.ponPieza(nuevo.tablero[mov.posInicial.fila][mov.posInicial.columna], mov.posFinal);//poner la pieza pos inicial en la final
                            nuevo.quitaPieza(mov.posInicial);//quitar la pieza de la pos inicial
                            if (juego.getTurno() =='b') {
                                juego.setTurno('n');
                                on=false;
                            }else{
                                if (juego.getTurno()=='n') {
                                    juego.setTurno('b');
                                    on=false;
                                }
                            }
                        }else{
                            System.out.println("Esa pieza no se mueve así");
                            on=false;
                        }
                    }else{
                        System.out.println("Ese movimiento no es valido");
                        on=false;
                    }
                }

            }else{
                System.out.println("Adios!! T~T\n"
                        + "gracias por jugar!");
                on=true;
            }
        }while(on==false);
        
    }
    
}
