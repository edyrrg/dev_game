/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.casillas.propiedad;

import game.casillas.Propiedad;
import game.player.Jugador;


public class Estacion extends Propiedad{
    
    public Estacion(String nombrePropiedad, Jugador Dueño, int precioCompra, int precioHipoteca, boolean hipotecado) {
        super(nombrePropiedad, Dueño, precioCompra, precioHipoteca, hipotecado);
    }
    
}
