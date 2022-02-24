/*
 Clase hijo LuchadorRudo
 */
package LuchadoresEj;

//import static LuchadoresEj.LuchadorTecnico.pEspecial;

//import static LuchadoresEj.LuchadorTecnico.vida;

/**
 *
 * @author fabianl
 */


public class LuchadorRudo extends Luchador{
    
     public static int vidaR;
   public int vidaR2;
   public static int pEspecialR;
   public int pEspecialR2;
   public static int num2;
   
    public LuchadorRudo(int vida, int pEspecial, String nombre){
        super (vida, pEspecial, nombre = nombre);
        
        vidaR=this.vida2;
        vidaR2=vidaR;
        pEspecialR=this.pEspecial;
        pEspecialR2=pEspecialR;
        
    }

    @Override
    public int restarVida() {
        vidaR=vidaR-golpe;        
        vidaR2=vidaR;
        
        return vidaR2;
    }
    
   
     @Override
    public int PoderEspecial(){
        pEspecialR--;
        pEspecialR2=pEspecialR;
        golpear();
        num2 = golpe;
        golpear();
        num2 = num2+golpe;
        
        golpe=num2;
        
        return golpe;
    }

   
}
   