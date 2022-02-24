/*
 Interface ContratoLuchador donde se declaran los métodos a usar
 */
package LuchadoresEj;

/**
 *
 * @author fabianl
 */
public interface ContratoLuchador {
    
    public String getNombre();
    public int getVida();
    public int golpear();
    public int restarVida();
    public int PoderEspecial();
    
    
}
