import java.util.Scanner;

public class TommeBeregner {

    public static void main(String[] args) {

        System.out.println("Velkommen til Tomme Beregneren!");
        double TOMMER_I_CM = 2.54;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Indtast en længde i tommer");
        double ANTAL_TOMMER = keyboard.nextDouble();

        System.out.println("Tommer i CM: " + ANTAL_TOMMER * TOMMER_I_CM);

    }

}
// System.out.printf("Afrundet til 2 decimaler med dansk komma: %,2f", cm
// der skrives f for float, 2 er antallet af decimaler og kan justeres
// "keyboard", kunne også bare være scanner eller input. Navne skal være let læselige.