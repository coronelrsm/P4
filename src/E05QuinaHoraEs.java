import java.util.Scanner;

public class E05QuinaHoraEs {

    public static void main(String[] args) {
        Scanner lector;
        int hora;
        int minuts;
        int segons;

        lector = new Scanner(System.in);

        System.out.print("Introdueix la hora: ");
        hora = lector.nextInt();
        lector.nextLine();

        System.out.print("Introdueix els minuts: ");
        minuts = lector.nextInt();
        lector.nextLine();

        System.out.print("Introdueix els segons: ");
        segons = lector.nextInt();
        lector.nextLine();

        if ((hora < 0) && (hora > 24)) {
            System.out.println("Hora incorrecta");
        } else if ((minuts < 0) && (minuts > 60)) {
            System.out.println("Minuts incorrectes");
        } else if ((segons<0) && (segons>60)) {
            System.out.println("Segons incorrectes");
        } else  {
            System.out.println("SÃ³n les " + hora + "hores" + minuts + " minuts" + segons + "segons");
        }

        if ((segons == 59) && (minuts < 60)) {
            System.out.println("En un segon seran les " + hora + "hores" + minuts+1 + "minuts" + "0 segons");
        } else  if ((segons == 59) && (minuts == 59)) {
            System.out.println("En un segon seran les " + hora+1 + "hores" + "en punt");
        } else {
            System.out.println("EN un segon seran les " + hora + "hores" + minuts + "minuts" + segons+1 + "segons");
        }
    }
}
