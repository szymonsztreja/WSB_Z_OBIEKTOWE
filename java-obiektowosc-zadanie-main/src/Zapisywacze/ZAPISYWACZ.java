package Zapisywacze;

import java.io.FileWriter;
import java.io.IOException;

public class ZAPISYWACZ implements Zapisywalne{
    @Override
    public void zapisz(String klient, String produkt, double koncowaCena) throws IOException {
        try (FileWriter writer = new FileWriter("zamowienia.txt", true)) {
            writer.write("Klient: " + klient + ", Produkt: " + produkt + ", Koszt: " + koncowaCena + "\n");
            System.out.println("Zapisano do bazy plikowej.");
        } catch (IOException e) {
//            System.out.println("Blad zapisu pliku: " + e.getMessage());
            throw new IOException(e.getMessage());
        }
    }
}
