/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.tableroChico;

/**
 *
 * @author yepiz
 */
public class modelo {
    private String tableroChico;
    private String tableroGrande;
    private String jugadores;
    private String j2;
    private String j3;
    private String j4;
    
    public modelo(){}
    
    public void set_tableroChico(String tableroChico){
        this.tableroChico=tableroChico;
    }
    
    public String get_tableroChico(){
        return this.tableroChico;
    }
    
    public void set_tableroGrande(String tableroGrande){
        this.tableroGrande=tableroGrande;
    }
    
    public String get_tableroGrande(){
        return this.tableroGrande;
    }

    public modelo(String jugadores) {
        this.jugadores = jugadores;
    }

    public String getJugadores() {
        return jugadores;
    }

    public void setJugadores(String jugadores) {
        this.jugadores = jugadores;
    }

    public modelo(String j2, String j3, String j4) {
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;
    }

    public String getJ2() {
        return j2;
    }

    public void setJ2(String j2) {
        this.j2 = j2;
    }

    public String getJ3() {
        return j3;
    }

    public void setJ3(String j3) {
        this.j3 = j3;
    }

    public String getJ4() {
        return j4;
    }

    public void setJ4(String j4) {
        this.j4 = j4;
    }
    private int[] posicionesJugadores; // Almacena la posición actual de cada jugador
    private int numCasillas; // El número de casillas del tablero

    public modelo(int numJugadores, int numCasillas) {
        posicionesJugadores = new int[numJugadores]; // Inicializa las posiciones de los jugadores
        this.numCasillas = numCasillas;
    }

    // Método para mover la ficha según el resultado del randomIndex
    public void moverFicha(int jugador, int randomIndex) {
        posicionesJugadores[jugador] += randomIndex; // Avanza la ficha según el valor random
        if (posicionesJugadores[jugador] >= numCasillas) {
            posicionesJugadores[jugador] = numCasillas - 1; // Limita la posición si se pasa
        }
    }

    // Método para obtener la posición actual de un jugador
    public int getPosicionJugador(int jugador) {
        return posicionesJugadores[jugador];
    }
    
    
}
