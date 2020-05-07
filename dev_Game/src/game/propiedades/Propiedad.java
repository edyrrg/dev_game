/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.propiedades;

import game.player.Jugador;

/**
 *
 * @author edyrrg
 */
public class Propiedad {
    private String nombrePropiedad;
    private Jugador Dueño;
    private int precioCompra;
    private int precioHipoteca;
    private boolean hipotecado;
    public Propiedad(String nombrePropiedad, Jugador Dueño, int precioCompra,
            int precioHipoteca, boolean hipotecado){
        this.nombrePropiedad = nombrePropiedad;
        this.Dueño = Dueño;
        this.precioCompra = precioCompra;
        this.precioHipoteca = precioHipoteca;
        this.hipotecado = hipotecado;
        
    }

    public String getNombrePropiedad() {
        return nombrePropiedad;
    }

    public Jugador getDueño() {
        return Dueño;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioHipoteca() {
        return precioHipoteca;
    }

    public boolean isHipotecado() {
        return hipotecado;
    }

    public void setNombrePropiedad(String nombrePropiedad) {
        this.nombrePropiedad = nombrePropiedad;
    }

    public void setDueño(Jugador Dueño) {
        this.Dueño = Dueño;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioHipoteca(int precioHipoteca) {
        this.precioHipoteca = precioHipoteca;
    }

    public void setHipotecado(boolean hipotecado) {
        this.hipotecado = hipotecado;
    }
    
    
}
