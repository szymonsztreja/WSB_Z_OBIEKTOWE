import java.io.FileWriter;
import java.io.IOException;

public class SystemZamowien {
    public void procesuj(String klient, String produkt, double cena, int ilosc, String typRabatu) {

//        walidator
        if (klient == null || klient.isBlank() || cena <= 0 || ilosc <= 0) {
            System.out.println("Blad: Niepoprawne dane zamówienia!");
            return;
        }
    // rabaty
        double koncowaCena = cena * ilosc;
        if (typRabatu.equals("STUDENT")) {
            koncowaCena = koncowaCena * 0.50;
        } else if (typRabatu.equals("STALY_KLIENT")) {
            koncowaCena = koncowaCena * 0.90;
        }
        // informator dupa
        System.out.println("Przetwarzanie zamowienia dla: " + klient);

        try (FileWriter writer = new FileWriter("zamowienia.txt", true)) {
            writer.write("Klient: " + klient + ", Produkt: " + produkt + ", Koszt: " + koncowaCena + "\n");
            System.out.println("Zapisano do bazy plikowej.");
        } catch (IOException e) {
            System.out.println("Blad zapisu pliku: " + e.getMessage());
        }

        System.out.println("Wysyłanie powiadomienia email na adres: " + klient + "@student.wsb.pl");
    }
}