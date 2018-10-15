
import java.util.Scanner;
public class E01Signe {

    public static void main(String[] args) {
        Scanner lector;
        int nombre;
        lector = new Scanner(System.in);

        System.out.println("Introdueix un nombre enter:");

        nombre = lector.nextInt();
        lector.nextLine();
        if (nombre < 0) {
            System.out.println("El nombre és negatiu");
        } else {
            System.out.println("El nombre és positiu");
        }
    }
}