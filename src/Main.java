public class Main {
    public static void main (String[] args) {

        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K.Rowling", 300, false);
        Ksiazka wiedzmin = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 320, true);
        Ksiazka wladcaPierscieni = new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1050, true);

        harryPotter.wypiszInfo();
        harryPotter.wypozycz();
        harryPotter.zwroc();

        Czytelnik janKowalaski = new Czytelnik("Jan", "Kowalski", 376, 2);

        janKowalaski.wypiszDane();
        janKowalaski.zwiekszLiczbeWypozyczen();
        janKowalaski.zmiejszLiczbeWypozyczen();

        Czytelnik jakubNowak = new Czytelnik("Jakub", "Nowak", 478, 3);

        jakubNowak.wypiszDane();
        jakubNowak.zwiekszLiczbeWypozyczen();
        jakubNowak.zmiejszLiczbeWypozyczen();


        Biblioteka mojaBiblioteka = new Biblioteka(4);

        mojaBiblioteka.dodajKsiazke(harryPotter);
        mojaBiblioteka.dodajKsiazke(wiedzmin);
        mojaBiblioteka.dodajKsiazke(wladcaPierscieni);
        System.out.println();

        mojaBiblioteka.wypiszDostepneKsiazki();
        System.out.println();

        mojaBiblioteka.znajdzKsiazkePoTytule("Wiedźmin");
        System.out.println();
        mojaBiblioteka.znajdzKsiazkePoTytule("Władca Pierścieni");
        System.out.println();

        int liczbaDostepnych = mojaBiblioteka.policzDostepneKsiazki();
        System.out.println("Dostepnych książek jest: " + liczbaDostepnych);
    }
}
