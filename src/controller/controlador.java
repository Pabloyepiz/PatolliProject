/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.modelo;
import view.tableroChico;
import view.tableroGrande;
import view.vista;

/**
 *
 * @author yepiz
 */
public class controlador implements ActionListener {

    private vista vista;
    private modelo modelo;

    public controlador(vista vista, modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void iniciar_vista() {
        vista.setTitle("Selección de Tabla");
        vista.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        modelo.set_tableroChico("Tablero Chico");
        modelo.set_tableroGrande("Tablero Grande");
    }

    public void jugadores() {
        int numJugadores = 0;
        if (vista.j2.isSelected()) {
            numJugadores = 2;
        } else if (vista.j3.isSelected()) {
            numJugadores = 3;
        } else if (vista.j4.isSelected()) {
            numJugadores = 4;
        }
    }
}
