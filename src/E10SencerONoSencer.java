
import java.util.Scanner;
public class E10SencerONoSencer {

    public static void main(String[] args) {
        Scanner lector;
        int nombre;
        lector = new Scanner(System.in);


        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre sencer: ");
        while (!sc.hasNextInt()) sc.next();
        int num = sc.nextInt();
        {
            System.out.println("Felicitats! Ã©s un nombre sencer");
        }
    }
}

