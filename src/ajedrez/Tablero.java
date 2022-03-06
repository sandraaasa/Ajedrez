/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * Clase Tablero
 * @author sancalsa
 * @version 6.3.2022
 */
public class Tablero {
//atributos
    /**
     * Atributo protegido tablero del Tablero compuesto por un array de piezas bidimensional
     */
    protected Pieza tablero[][] = new Pieza [8][8];
    
//constructores
    /**
     * Constructor que permite la creacion de un objeto de tipo Tablero
     * inicializado como un tablero de ajedrez al principio de una partida
     */
    public Tablero(){
        tablero[0][0]=new Torre('b');
        tablero[0][1]=new Caballo('b');
        tablero[0][2]=new Alfil('b');
        tablero[0][3]=new Dama('b');
        tablero[0][4]=new Rey('b');
        tablero[0][5]=new Alfil('b');
        tablero[0][6]=new Caballo('b');
        tablero[0][7]=new Torre('b');
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(i==1&&j>=0&&j<=7){
                    tablero[i][j]=new Peon('b');
                }
                if(i==6&&j>=0&&j<=7){
                    tablero[i][j]=new Peon('n');
                }
            } 
        }
        tablero[7][0]=new Torre('n');
        tablero[7][1]=new Caballo('n');
        tablero[7][2]=new Alfil('n');
        tablero[7][3]=new Dama('n');
        tablero[7][4]=new Rey('n');
        tablero[7][5]=new Alfil('n');
        tablero[7][6]=new Caballo('n');
        tablero[7][7]=new Torre('n');
        
    }

//Metodos
    /**
     * Metodo que imprime el tablero recorriendo el array 
     * y pintando todas las piezas en un tablero
     */
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j]!=null)
                   System.out.print(tablero[i][j]+"  ");
                else
                   System.out.print("__"+"  ");
            }
            System.out.println("");
        }
    }

    /**
     * Metodo que permite saber mediate un boolean 
     * si hay una pieza en una posicion determinada
     * @param fila numero entero con el valor de la fila
     * @param columna numero entero con el valor de la columna
     * @return boolean de la fila y columna de la pieza
     */
    public boolean hayPieza(int fila,int columna){
        boolean on=false;
        if (tablero[fila][columna]!=null){
            on=true;
        }       
        return on;
    }
    /**
     * Metodo que permite saber mediate un boolean 
     * si hay una pieza en una posicion determinada
     * @param pos Posicion 
     * @return boolean de la posicion de la pieza
     */
    public boolean hayPieza(Posicion pos){
        return hayPieza(pos.fila,pos.columna);
    }
    /**
     * Metodo que permite saber mediate un boolean 
     * si hay una pieza entre una posicion inicial determinada y otra
     * @param mov Movimiento de la pieza
     * @return boolean del movimiento de la pieza
     */
    public boolean hayPiezaEntre (Movimiento mov){
        boolean on=false;
        return on;
    }
    
    /**
     * Metodo que permite modificar la pieza de una posicion determinada
     * @param figura Pieza del tablero con la que averiguaremos la posicion inicial
     * @param fila numero entero de la posicion en la que queremos poner la pieza
     * @param columna numero entero de la posicion en la que queremos poner la pieza
     */
    public void ponPieza(Pieza figura, int fila, int columna){
        if (tablero[fila][columna]==null||tablero[fila][columna].getColor()!=figura.getColor()){
            tablero[fila][columna]= figura;//comer pieza 
        }else System.out.println("NO AL CANIVALISMO. No puedes comerte tus propias piezas");
    }
    /**
     * Metodo que permite modificar la pieza de una posicion determinada
     * @param figura Pieza del tablero con la que averiguaremos la posicion inicial
     * @param pos Posicion en la que queremos poner la pieza
     */
    public void ponPieza(Pieza figura, Posicion pos){ponPieza(figura,pos.fila,pos.columna);}
    /**
     * Metodo que permite eliminar la pieza de una posicion determinada(poniendo esta posicion a null)
     * @param fila numero entero de la posicion de la pieza
     * @param columna numero de la posicion de la pieza
     */
    public void quitaPieza(int fila,int columna){tablero[fila][columna]=null;}
    /**
     * Metodo que permite eliminar la pieza de una posicion determinada(poniendo esta posicion a null)
     * @param pos posicion de la pieza
     */
    public void quitaPieza(Posicion pos){tablero[pos.fila][pos.columna]=null;}
    
    /**
     * Metodo que devuelve la primera letra de la pieza y su atributo color
     * @param fila numero entero de la posicion de la pieza
     * @param columna numero entero de la posicion de la pieza
     * @return String de la pieza en esa posicion
     */
    public String DevuelvePieza(int fila,int columna){return tablero[fila][columna].pintarPieza();}
    /**
     * Metodo que devuelve la figura de una pieza
     * @param pos Posicion de la pieza
     * @return Pieza de la posicion
     */
    public Pieza DevuelvePieza(Posicion pos){return tablero[pos.fila][pos.columna];}
    
}
