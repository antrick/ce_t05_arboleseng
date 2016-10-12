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
public class Lista<NodoA>
{
    private Nodo inicio;
    
    public Nodo getInicio(){
     return inicio;
    }
    public Object getInicial(){
     return inicio.getDato();
    }
    public void insertaInicio(NodoA dato){
     Nodo nodo= new Nodo(dato);
     nodo.setSig(inicio);
     inicio=nodo;
    }
    public void insertaFinal(NodoA dato){
     Nodo aux; 
     if(inicio!=null){
        aux=inicio;
        while(aux.getSig()!=null){
         aux=aux.getSig();
        }
        aux.setSig(new Nodo(dato));
        }else{
         insertaInicio(dato);
        }
    }
    public void recorre(){
     Nodo aux=inicio;
     if(aux==null){
        System.out.println("La lista esta vacia!");
        }else{
        while(aux!=null){
         System.out.print("["+aux.getDato()+"]-> ");
         aux=aux.getSig();
        }
        }
    }
    
    public Integer suma(){
         Nodo aux=inicio;
         Integer total=0;
     if(aux!=null){
        //System.out.println("La lista esta vacia!");
        //return 0;
        
        while(aux!=null){
          total+=(int)aux.getDato();
         aux=aux.getSig();
        }
        return total;
        //System.out.println("Total:"+total);
        }    
        return total;
    }
    public void muestraFinal(){
       
     Nodo aux=inicio;
     if(aux==null){
        System.out.println("La lista esta vacia!");
        }else{
        while(aux!=null){
         if(aux.getSig()==null)
          System.out.print(aux.getDato()+"\n");
         
          aux=aux.getSig();
        }
        }
    }
    public Nodo EliminaFinal(){
     Nodo temporal,anterior=null;
     Nodo aux=null;
     temporal=inicio;
      
      if(inicio.getSig()==null){
        inicio=null;
        return aux;
        }else{
         while(temporal.getSig()!=null){
            anterior=temporal;
            temporal=temporal.getSig();
            }
            aux= anterior;
            anterior.setSig(null);
        }
     
        return aux;
    }
    /**devuelve nodo*/
    public Nodo eliminaInicio(){
     Nodo temporal=inicio;
         Nodo aux=null;
         if(temporal.getSig()!=null){
             if(inicio!=null){
                 aux=inicio;
                 inicio=inicio.getSig();
            }
             else{
              aux=inicio;
              inicio=null;
             }
            }
           return aux; 
    }
    
    /**tipo void*/
    public void EliminarInicio() {
        Nodo temporal=inicio;
       if(estavacia()) 
          System.out.println ("La lista esta vacía, no se puede eliminar");
       
       if (temporal.getSig()!=null){
           inicio=temporal.getSig();
           System.out.println ("Ha sido eliminado el inicio");
        }else{
          inicio=null;
          System.out.println ("Ha sido eliminado el inicio");
        }
    }
    public void agregarAntesDe(NodoA dato, NodoA referencia) {
        boolean band=true;
        Nodo temporal, encontrado;
        temporal=inicio;
        encontrado=temporal;
                     
           while( (temporal.getDato()!= referencia)&&band) {
               if(temporal.getSig()!=null){
                   encontrado=temporal;
                   temporal=temporal.getSig();
                }else{
                    band=false;
                }
              
           }
           
          
           if(band){
               if(temporal==inicio){
                   insertaInicio(dato);
                }else{
                    Nodo nuevo=new Nodo (dato);
                    nuevo.setSig(temporal);
                    encontrado.setSig(nuevo);
                    System.out.println ("Ha sido agregado antes de: "+referencia);
                }
            }
          
    }
    public void agregarDespuesDe(NodoA dato, NodoA referencia) {
       boolean band=true;
       Nodo temporal = inicio;
       Nodo n = new Nodo(dato);
       
         while( temporal.getDato()!=referencia && band) {
           if(temporal.getSig()!=null)
                  temporal = temporal.getSig();
                else{
                    band=false;
                }
             }
             
          if(band){
               if(temporal==inicio){
                   insertaInicio(dato);
                }else{
                    Nodo nuevo=new Nodo (dato);
                    nuevo.setSig(temporal.getSig());
                    temporal.setSig(nuevo);
                    System.out.println ("Ha sido agregado después de: "+referencia);
                }
            }
       
    }
    
    
    public void eliminarAntesDe(NodoA referencia) {
       Nodo atras = null;
       Nodo  temporal = inicio;
       
        if(estavacia()) 
          System.out.println ("La lista esta vacía, no se puede eliminar");
        
        while( temporal.getSig()!=null && referencia!=(temporal.getDato())) {
             atras = temporal;
             temporal = temporal.getSig();
          }
          atras.setSig(temporal.getSig());
         System.out.println ("Ha sido eliminado antes de la referencia"+referencia);
    }
    
    public void eliminarDespuesDe(NodoA referencia) {
       Nodo atras = null;
       Nodo temporal = inicio;
       int dato;
       if(estavacia()) 
          System.out.println ("La lista esta vacía, no se puede eliminar");
          
       if(temporal.getSig()==null) 
           EliminarInicio();
          
       while( temporal.getSig()!=null && referencia!=(temporal.getDato())) {
             atras = temporal;
             temporal = temporal.getSig();
          }
          atras.setSig(temporal.getSig());
       System.out.println ("Ha sido eliminado después de la referencia"+referencia);
    }
    
     public Nodo<NodoA> buscar(Object m) {
       Nodo<NodoA> temporal = inicio;
       boolean band=true;
         while(temporal.getDato()!= m  && band){
              if (temporal.getSig()!=null){
                  temporal=temporal.getSig();
                }else{
                    band=false;
                }
            }
            
          if (band){
                return temporal;
            } else{
                return null;
            }
     }
     
   public String toString(){
     Nodo temporal=inicio;
     String s=" ";
     if(inicio==null){
     System.out.println("La lista esta vacia!");
    }
    else{
     while(temporal!=null){
          s+=temporal.getDato()+"-> null";
          temporal=temporal.getSig();
        }
        
    }
    return s+"null";
     }
    public boolean estavacia(){
      return inicio==null;
    }
   
}

