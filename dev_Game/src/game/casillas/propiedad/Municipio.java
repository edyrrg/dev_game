/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.casillas.propiedad;

import game.casillas.Propiedad;
import game.player.Jugador;


public class Municipio extends Propiedad {
    private int cantidad_Hoteles;
    private int cantidad_Casa;
    private int costo_Estancia;
    private int grupo_Propiedades1;
    public Municipio(String nombrePropiedad, Jugador Dueño, int precioCompra, int precioHipoteca, boolean hipotecado) {
        super(nombrePropiedad, Dueño, precioCompra, precioHipoteca, hipotecado);
    }
    
}
