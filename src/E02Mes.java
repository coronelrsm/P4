import java.util.Scanner;

public class E02Mes {
    public static void main(String[] args) {
        Scanner lector;
        int dia;
        lector = new Scanner(System.in);
        dia = lector.nextInt();

        System.out.println("Digues a quin dia estem aquest mes de Gener:");
        if ((dia < 0) && (dia > 31)) {
            System.out.println("Data errÃ²nia");
        }
        else
        { System.out.println("Estem a " + dia + "de Gener");
        }

    }


}
