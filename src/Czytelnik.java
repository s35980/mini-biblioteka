import java.util.Scanner;

public class Czytelnik {

    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik (String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Numer Karty: " + this.numerKarty);
        System.out.println("Liczba wypożyczeń: " + this.liczbaWypozyczen);
    }

    public void zwiekszLiczbeWypozyczen () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz wypożyczyć książkę ?");
        String wypozyczenie = sc.nextLine();
        if (wypozyczenie.equals("tak") || wypozyczenie.equals("TAK")) {
            this.liczbaWypozyczen++;
            System.out.println("Liczba wypożyczeń teraz wynosi: " + this.liczbaWypozyczen);
        } else if (wypozyczenie.equals("nie") || wypozyczenie.equals("NIE")) {
            System.out.println ("Okej");
        }
    }

    public void zmiejszLiczbeWypozyczen () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz oddać książkę ?");
        String wypozyczenie = sc.nextLine();
        if (wypozyczenie.equals("tak") || wypozyczenie.equals("TAK")) {
            liczbaWypozyczen--;
            System.out.println("Liczba wypożyczeń teraz wynosi: " + this.liczbaWypozyczen);
        } else if (wypozyczenie.equals("nie") || wypozyczenie.equals("NIE")) {
            System.out.println ("Okej");
        }
    }
}