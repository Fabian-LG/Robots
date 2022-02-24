/*
 Main Class donde se realiza el ciclo
Letra t = técnico
Letra r = rudo
Letra l = luchador
Letra v = vida
Letra g = golpe
 */
package LuchadoresEj;

/**
 *
 * @author fabianl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int contador = 1;

        LuchadorTecnico lt = new LuchadorTecnico(100, 2, "TÉCNICO");
        LuchadorRudo lr = new LuchadorRudo(100, 2, "RUDO");

        System.out.println(lt);
        System.out.println(lr);
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------");

        do {

            int peLT = lt.pEspecialT2;
            int peLR = lr.pEspecialR2;

            if (peLT >= 1 && (contador == 7 || contador == 21)) {
                lt.PoderEspecial();
                int sg = lt.golpe;
                System.out.print("Súper golpe: " + sg + "   |  ");
                lr.restarVida();
                int vidaRu = lr.vidaR2;
                System.out.println("Vida Rudo: " + vidaRu);

            }
            if (peLR >= 1 && (contador == 7 || contador == 21)) {
                lr.PoderEspecial();
                int hp = lr.golpe;
                System.out.print("Hipnotizar: " + hp + "    |  ");
                lt.restarVida();
                int vidaTc = lt.vidaT2;
                System.out.println("Vida Técnico: " + vidaTc);
                System.out.println("--------------------------------------");
            }

            lt.golpear();
            int ltg = lt.golpe;
            System.out.print("Golpe Técnico: " + ltg + "  |  ");
            lr.restarVida();
            int lrv = lr.vidaR2;
            System.out.println("Vida Rudo: " + lrv);

            lr.golpear();
            int lrg = lr.golpe;
            System.out.print("Golpe Rudo: " + lrg + "     |  ");
            lt.restarVida();
            int ltv = lt.vidaT2;
            System.out.println("Vida Técnico: " + ltv);

            System.out.println("--------------------------------------");

            if (ltv <= 0) {
                System.out.println("-----------------------");
                System.out.println("GANADOR: " + lr.getNombre() + "!!!");
                System.out.println("-----------------------");
                break;
            } else if (lrv <= 0) {
                System.out.println("-----------------------");
                System.out.println("GANADOR: !!!" + lt.getNombre() + "!!!");
                System.out.println("-----------------------");
                break;
            }

            contador++;

        } while (true);

    }

}
