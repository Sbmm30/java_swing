/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.Controlador;
import model.Modelo;
import view.Vista;

/**
 *
 * @authorsbmm30 https://github.com/sbmm30
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista view = new Vista();
        Modelo model = new Modelo();
        Controlador controller = new Controlador(view, model);
        
        view.setVisible(true);
    }
    
}
