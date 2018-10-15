import java.util.Scanner;

public class E06Velocitats {

    public static void main(String[] args) {
        Scanner lector;
        int velocitatInicial;
        int acceleracio;
        int temps;
        int velocitatInstantania;
        int velocitatMitja;

        lector = new Scanner(System.in);

        System.out.print("Introdueix la velocitat inicial (m/s): ");
        velocitatInicial = lector.nextInt();
        lector.nextLine();

        System.out.print("Introdueix l'acceleraciÃ³ (m/sÂ²): ");
        acceleracio = lector.nextInt();
        lector.nextLine();

        System.out.print("Introdueix el temps (s): ");
        temps = lector.nextInt();
        lector.nextLine();

        velocitatInstantania = velocitatInicial * acceleracio * temps;
        velocitatMitja = (velocitatInicial + velocitatInstantania) / 2;

        if (velocitatInstantania <= 0) {
            System.out.println("El vehicle estÃ  parat");
        } else {
            System.out.println("La velocitat instantÃ nia Ã©s " + velocitatInstantania + "m/s");
            System.out.println("La velocitatMitja Ã©s" + velocitatMitja + "m/s");
        }


    }
}
