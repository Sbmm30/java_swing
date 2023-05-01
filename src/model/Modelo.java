/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sbmm30 https://github.com/sbmm30
 */
public class Modelo {

    private int categoria;
    private double promedio;
    private double pensionActual;
    private double pensionNueva;
    private double descuento;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPensionActual() {
        return pensionActual;
    }

    public void setPensionActual(double pensionActual) {
        this.pensionActual = pensionActual;
    }

    public double getPensionNueva() {
        return pensionNueva;
    }

    public void setPensionNueva(double pensionNueva) {
        this.pensionNueva = pensionNueva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularPensionActual() {
        switch (this.categoria) {
            case 0:
                this.pensionActual = 550;
                break;
            case 1:
                this.pensionActual = 500;
                break;
            case 2:
                this.pensionActual = 460;
                break;
            case 3:
                this.pensionActual = 400;
                break;
            default:
                throw new AssertionError();
        }
        return this.pensionActual;
    }

    public double calcularDescuento() {
        if (this.promedio >= 0.00 && this.promedio < 14.00) {
            this.descuento = 0;
        } else if (this.promedio >= 14.00 && this.promedio < 16.00) {
            this.descuento = this.pensionActual * 0.1;
        } else if (this.promedio >= 16.00 && this.promedio < 18.00) {
            this.descuento = this.pensionActual * 0.12;
        } else if (this.promedio >= 18.00 && this.promedio <= 20.00) {
            this.descuento = this.pensionActual * 0.15;
        } else {
            this.descuento = 0;
        }
        return this.descuento;
    }

    public double calcularPensionNueva() {
        this.pensionNueva = this.pensionActual - this.descuento;
        return this.pensionNueva;
    }

    public void ejecutarOperaciones() {
        calcularPensionActual();
        calcularDescuento();
        calcularPensionNueva();
    }
}
