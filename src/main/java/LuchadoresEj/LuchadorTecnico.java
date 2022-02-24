/*
 Clase hijo LuchadorTécnico
 */
package LuchadoresEj;

/**
 *
 * @author fabianl
 */
public class LuchadorTecnico extends Luchador {

    public static int vidaT;
    public int vidaT2;
    public static int pEspecialT;
    public int pEspecialT2;
    public int num2;

    public LuchadorTecnico(int vida, int pEspecial, String nombre) {
        super(vida, pEspecial, nombre);

        vidaT = this.vida2;
        vidaT2 = vidaT;
        pEspecialT = this.pEspecial;
        pEspecialT2 = pEspecialT;

    }

    @Override
    public int restarVida() {
        vidaT = vidaT - golpe;
        vidaT2 = vidaT;

        return vidaT2;
    }

    @Override
    public int PoderEspecial() {
        pEspecialT--;
        pEspecialT2 = pEspecialT;

        golpear();

        num2 = golpe * 2;

        golpe = num2;

        return golpe;
    }

}
