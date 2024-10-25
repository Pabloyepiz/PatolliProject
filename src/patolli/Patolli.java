/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patolli;

import controller.controlador;
import model.modelo;
import view.vista;

/**
 *
 * @author yepiz
 */
public class Patolli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        modelo modelo = new modelo();
        vista vista = new vista();
        controlador controlador = new controlador(vista, modelo);
        controlador.iniciar_vista();
        
        vista.setVisible(true);
    }
    
}
