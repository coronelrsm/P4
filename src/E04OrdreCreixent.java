import java.util.Scanner;

public class E04OrdreCreixent {

    public static void main(String[] args) {
        Scanner lector;
        int num1;
        int num2;
        int num3;

        lector = new Scanner(System.in);

        System.out.print("Introdueix el primer nombre enter: ");
        num1 = lector.nextInt();
        lector.nextLine();

        System.out.print("Introdueix el segon nombre enter: ");
        num2 = lector.nextInt();
        lector.nextLine();

        System.out.print("Introdueix el tercer nombre enter: ");
        num3 = lector.nextInt();
        lector.nextLine();

        if ((num1 < num2) && (num2 < num3)) {
            System.out.println("Has introduÃ¯t els nÃºmeros en ordre creixent");
        } else{
            System.out.println("No has introduÃ¯t els nÃºmeros en ordre creixent");
        }

    }
}
