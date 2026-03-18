public class Main {
    public static void main (String[] args) {
        Ksiazka harryPotter = new Ksiazka("Harry Potter", "J.K.Rowling", 300, false);

        harryPotter.wypiszInfo();
        harryPotter.wypozycz();
        harryPotter.zwroc();
    }
}
