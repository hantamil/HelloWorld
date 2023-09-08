import java.util.Scanner;

public class MeterOmregner {
    public static void main (String[] args) {

        System.out.println("Velkommen til MeterOmregneren!");
        double METER_I_TOMMER = 39.3700787;
        double METER_I_FOD = 3.2808399;
        double METER_I_YARDS = 1.09;
        double METER_I_MILES = 0.000621371192;
        double METER_I_SØMIL = 0.00053996;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Indtast en længde i meter");
        double ANTAL_METER = keyboard.nextDouble();

        System.out.println(ANTAL_METER + " meter svarer til:");
        System.out.println(ANTAL_METER * METER_I_TOMMER + " tommer");
        System.out.println(ANTAL_METER * METER_I_FOD + " fod");
        System.out.println(ANTAL_METER * METER_I_YARDS + " yards");
        System.out.println(ANTAL_METER * METER_I_MILES + " miles");
        System.out.println(ANTAL_METER * METER_I_SØMIL + " sømil");
    }

}
