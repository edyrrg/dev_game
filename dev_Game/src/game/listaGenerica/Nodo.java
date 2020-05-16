/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.listaGenerica;

/**
 *
 * @author edyrr
 */
public class Nodo <T> {
    private T content;
    private Nodo next;
     public Nodo(T contenido) {
        this.content = content;
    }
    
    public T getContet() {
        return content;
    }
    
    public Nodo getNext() {
        return next;
    }
    
    public void setNext(Nodo<T> next) {
        this.next = next;
    }
}
