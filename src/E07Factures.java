import java.util.Scanner;

public class E07Factures {
    public static final float DESCOMPTE = 15;
    public static final float COMPRA_MIN = 150;

    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        float preu;
        float descompteFet;
        System.out.print("Introdueix l'import brut de la factura: ");
        preu = lector.nextFloat();
        lector.nextLine();
        if (preu > 0) {
            if (preu >= COMPRA_MIN) {
                descompteFet = preu * DESCOMPTE / 100;
                if (descompteFet > DESC_MAXIM) {
                    descompteFet = DESC_MAXIM;
                }
                preu = preu - descompteFet;
            }
            System.out.println("El preu final per pagar Ã©s de " + preu + " euros.");
        } else {
            System.out.println("Preu incorrecte. Ã‰s negatiu.");
        }
    }
}

unodostres