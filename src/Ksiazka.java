import java.util.Scanner;

public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba stron: " + this.liczbaStron);
        System.out.println("Dostepna: " + this.dostepna);
    }

    public void wypozycz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz wypożyczyć książkę " + this.tytul);
        String wypozyczenie = sc.nextLine();
        if (wypozyczenie.equals("tak") || wypozyczenie.equals("TAK")) {
            if (this.dostepna == true) {
                System.out.println("Można wypożyczyć książkę " + this.tytul);
            } else {
                System.out.println("Książka niedostępna");
            }
        } else if (wypozyczenie.equals("nie") || wypozyczenie.equals("NIE")) {
            System.out.println("Okej");
        }
    }

    public void zwroc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz zwrócić książkę " + this.tytul + " ?");
        String zwracanie = sc.nextLine();
        if (zwracanie.equals("tak") || zwracanie.equals("TAK")) {
            System.out.println("Dziękujemy za zwrot książki " + this.tytul);
        } else if (zwracanie.equals("nie") || zwracanie.equals("NIE")) {
            System.out.println("Okej");
        }
    }
}
