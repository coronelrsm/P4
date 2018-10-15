import java.util.Scanner;

public class E03ComparacioNumeros {

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
        if (num1 >= num2) {
            num3 = num1;
            num1 = num2;
            num2 = num3;
            System.out.println("Ara el valor del primer nÃºmero Ã©s " + num1 + " i el valor del segon nÃºmero Ã©s " + num2);
        }
    }
}


