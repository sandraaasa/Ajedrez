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
public class Tablero {
    
    protected Pieza tablero[][] = new Pieza [8][8];
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

    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
            if (tablero[i][j]!=null)
               System.out.print(tablero[i][j]+"  "); //si quiero letras llamo a pintar de pieza
            else
               System.out.print("__"+"  ");
            }
            
            System.out.println("");
        }
    }

//Metodos
    public boolean hayPieza(int fila,int columna){
        boolean on=false;
        if (tablero[fila][columna]!=null){
            on=true;
        }       
        return on;
    }
    public boolean hayPieza(Posicion pos){
        return hayPieza(pos.fila,pos.columna);
    }
    /*public boolean hayPiezaEntre (Movimiento mov){}*/ //es muy largo
    
    public void ponPieza(Pieza figura, int fila, int columna){
        if (hayPieza(fila,columna)==true){
            tablero[fila][columna]= figura;
        }
    }
    public void ponPieza(Pieza figura, Posicion pos){ponPieza(figura,pos.fila,pos.columna);}
    
    public void quitaPieza(int fila,int columna){tablero[fila][columna]=null;}
    public void quitaPieza(Posicion pos){tablero[pos.fila][pos.columna]=null;}
    
    public String DevuelvePieza(int fila,int columna){return tablero[fila][columna].pintarPieza();}
    public Pieza DevuelvePieza(Posicion pos){return tablero[pos.fila][pos.columna];}
    
    
    @Override
    public String toString() {
    return "tablero";
    }
    
}
