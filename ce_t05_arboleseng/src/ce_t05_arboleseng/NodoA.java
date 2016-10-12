/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce_t05_arboleseng;

/**
 *
 * @author andy
 */
public class NodoA<T extends Comparable<T>>
{
    private T dato;
    private Lista<NodoA<T>> hijos;
    private NodoA siguiente;
    public NodoA(T dato){
     this.dato=dato;
     hijos=new Lista<NodoA<T>>();
     siguiente=null;
    }
    public NodoA(){
     dato=null;
     hijos=new Lista<NodoA<T>>();
     siguiente=null;
    }
    public void setDato(T dato){
     this.dato=dato;
    }
    public T getDato(){
     return dato;
    }
    public void setSiguiente(NodoA siguiente){
     this.siguiente=siguiente;
    }
    public NodoA getSiguiente(){
     return siguiente;
    }
    public Lista getHijos(){
     return hijos;
    }
    
   
    
}

