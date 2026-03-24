public class Biblioteka {

    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka (int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke (Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
            System.out.println ("Dodałeś książkę do biblioteki.");
        } else {
            System.out.println ("Nie ma miejsca w bibliotece,nie da się dodać książki.");
        }
    }

    public void wypiszDostepneKsiazki() {
        System.out.println("Dostępne książki to:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getDostepna()) {
                ksiazki[i].wypiszInfo();
            }
        }
    }

    public void znajdzKsiazkePoTytule (String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                System.out.println ("Znalezione książki:");
                ksiazki[i].wypiszInfo();
                return;
            }
        }
        System.out.println ("Książka " + tytul + " nie została znaleziona.");
    }

    public int policzDostepneKsiazki () {
        int dostepneKsiazki = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getDostepna()) {
                dostepneKsiazki++;
            }
        }
        return dostepneKsiazki;
    }
}