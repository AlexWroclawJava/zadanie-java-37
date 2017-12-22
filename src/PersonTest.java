import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Test wpisywania przykladowych danych osobowych ponizej");
        Person person = new Person("Michal", "Tomczynski",37, "80046500165");
        System.out.println(person.toString());

        System.out.println("\nPodaj imie: ");
        String imie = scanner.next();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.next();

        System.out.println("Podaj pesel: ");
        String numerPesel = scanner.next();

        System.out.println("\nPobrane dane to: ");
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(numerPesel);

    }
}
