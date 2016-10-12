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
public class Arbol<T>
{
    private NodoA raiz;
    /*public NodoA buscar(T m) {
       NodoA temporal = raiz;
       boolean band=true;
         while(temporal.getDato().compareTo(m)!=0 && band){
              if (temporal.getSiguiente()!=null){
                  temporal=temporal.getSiguiente();
                }else{
                    band=false;
                }
            }
            
          if (band){
                return temporal;
            } else{
                return null;
            }
     }*/
    public void recorrer(){
        NodoA<Integer> raiz=new NodoA<Integer>();
      raiz.setDato(1);
      NodoA<Integer> nuevo=new NodoA<Integer>();
      nuevo.setDato(2);
      raiz.getHijos().insertaInicio(nuevo);
      nuevo=new NodoA<Integer>();
      nuevo.setDato(3);
      raiz.getHijos().insertaFinal(nuevo);
      System.out.println(raiz.getDato());
      
     NodoA ayu= (NodoA)raiz.getHijos().getInicio().getDato();
     System.out.println(ayu.getDato());
     
     NodoA ay= (NodoA)raiz.getHijos().getInicio().getSig().getDato();
     System.out.println(ay.getDato());
    }
    public static void main(String [] args){
        Arbol a=new Arbol();
      
      
      a.recorrer();
    }
}

