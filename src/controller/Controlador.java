/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Modelo;
import view.Vista;

/**
 *
 * @author @authorsbmm30 https://github.com/sbmm30
 */
public class Controlador implements ActionListener {

    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnCalcular.addActionListener(this);
        this.view.btnNuevo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setCategoria(view.cbCategoria.getSelectedIndex());
        model.setPromedio(Integer.parseInt(view.tfPromedio.getText()));

        if (e.getSource() == view.btnCalcular) {
            model.ejecutarOperaciones();
            view.tfPensionActual.setText(String.valueOf(model.getPensionActual()));
            view.tfPensionNueva.setText(String.valueOf(model.getPensionNueva()));
            view.tfDescuento.setText(String.valueOf(model.getDescuento()));
        } else if (e.getSource() == view.btnNuevo) {
            view.cbCategoria.setSelectedIndex(0);
            view.tfPromedio.setText(null);
            view.tfPensionActual.setText(null);
            view.tfPensionNueva.setText(null);
            view.tfDescuento.setText(null);
        } else {

        }
    }

}
