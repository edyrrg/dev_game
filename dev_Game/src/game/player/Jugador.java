/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.player;

public class Jugador {
    private String nombre;
    private int money;
    
    public Jugador(String nombre, int money){
        this.money = money;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMoney() {
        return money;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public void lanzarDados(){
        
    }
    
    public void visualizarPropiedades(){
        
    }
    
    public void hipotecarPropiedad(){
        
    }
    
    public void construirEdificioPropiedad(){
        
    }
    
    public void declararBancarrota(){
        
    }
    
    public void terminarTurno(){
        
    }
    
}
