/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.listaGenerica;

import java.util.ArrayList;

/**
 *
 * @author edyrr
 */
public class Lista<T> { 
    private Nodo <T> firstItem;
    private Nodo <T> lastItem;
    private int cantidadElementos;
    public Nodo getItem(int location) throws Exception{
        if (isEmpty()|| location >= cantidadElementos) {
            throw new Exception("No se encuentra el indice '" + location +"' en la lista.");
        }
        
        if (location == cantidadElementos - 1) {
            return lastItem;
        } else if (location == 0) {
            return firstItem;
        } else {
            Nodo<T> elementoEnCuestion = firstItem;
            for (int i = 0; i < location; i++) {
                elementoEnCuestion = elementoEnCuestion.getNext();
            }
            return elementoEnCuestion;
        }
    }
    public boolean isEmpty(){
        return cantidadElementos == 0;
    }

    public void setItem(T item) {
        if (isEmpty()) {
            setFirstItem(item);
        } else {
            Nodo<T> nuevoElemento = new Nodo<>(item);
            lastItem.setNext(nuevoElemento);
            lastItem = nuevoElemento;
            cantidadElementos++;
        }
    }
    private void setFirstItem(T item) {
        Nodo<T> nuevo = new Nodo<>(item);
        firstItem = nuevo;
        lastItem = nuevo;
        cantidadElementos++;
    }
    public void setItem(int location, T item) throws Exception {
        Nodo<T> aReemplazar = getItem(location); 
        Nodo<T> anterior = getItem(location - 1); 
        Nodo<T> nuevo = new Nodo<>(item);
        anterior.setNext(nuevo);
        nuevo.setNext(aReemplazar);
        cantidadElementos++;
    }
    
    public Nodo getFirstItem() {
        return firstItem;
    }
    
    public Nodo getLastItem() {
        return lastItem;
    }
    
    public int getQuantyItems() {
        return cantidadElementos;
    }
}
