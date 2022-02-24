/*
 Clase padre luchador
 */
package LuchadoresEj;

/**
 *
 * @author fabianl
 */
public abstract class Luchador implements ContratoLuchador{

    protected String nombre;  
    protected static int vida;    
    protected int vida2;
    protected int pEspecial;
    protected double nAlt;   
    protected static int golpe;
    
    
        
    
    public Luchador (int vida, int pEspecial, String nombre){
        this.vida = vida; 
        this.vida2=vida;
        this.nombre=nombre;
        
        this.pEspecial = pEspecial;
    }
    
    @Override
    public String getNombre() {
        this.nombre = nombre;
        
        return nombre;
    }

    @Override
    public int getVida() {
        this.vida2=vida;
        
        return vida;
    }

    @Override
    public int golpear() {         
        this.golpe=golpe;
         nAlt = Math.random();
        golpe = (int) (nAlt*5)+1;
        
        return golpe;
    }

    public abstract int restarVida();
    public abstract int PoderEspecial();
   
          
    @Override
    public String toString(){
    
        
        return "Luchador: " + nombre + ", vida: "+ vida + ", poder especial: "+ pEspecial;
    
        
}


   
    
}
