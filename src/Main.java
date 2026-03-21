public class Main {
    public static void main (String[] args) {
        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K.Rowling", 300, false);

        harryPotter.wypiszInfo();
        harryPotter.wypozycz();
        harryPotter.zwroc();

        Czytelnik janKowalaski = new Czytelnik("Jan", "Kowalski", 376, 2);

        janKowalaski.wypiszDane();
        janKowalaski.zwiekszLiczbeWypozyczen();
        janKowalaski.zmiejszLiczbeWypozyczen();
    }
}
