import java.time.LocalDateTime;
import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello DAT23D");

        System.out.println("Hello world\nHello DAT23D");
        System.out.println("Hello World" + " HelloDAT23");

        System.out.println(23+1);
        System.out.println("Dette er år: " + 2023);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());
    }
}