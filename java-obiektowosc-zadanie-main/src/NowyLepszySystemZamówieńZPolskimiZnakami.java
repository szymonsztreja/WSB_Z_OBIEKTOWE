import NoweWalidatory.Walidator;
import NoweWalidatory.ZamowienieDTO;
import Poroumiewacze.Porozumiewalne;
import Rabats.FabrykaRabatow;
import Rabats.Rabatowalny;
import Zapisywacze.Zapisywalne;

import java.io.IOException;

public class NowyLepszySystemZamówieńZPolskimiZnakami {

    FabrykaRabatow fabrykaRabatow;
    Walidator walidator;
    Zapisywalne zapisywalne;
    Porozumiewalne porozumiewalne;

    public NowyLepszySystemZamówieńZPolskimiZnakami( Walidator walidator, Zapisywalne zapisywalne, Porozumiewalne porozumiewalne) {
        this.walidator = walidator;
        this.zapisywalne = zapisywalne;
        this.porozumiewalne = porozumiewalne;
    }

    public void procesujZamowienie(ZamowienieDTO zamowienieDTO){

        try {
            this.walidator.validate(zamowienieDTO);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        double cena = zamowienieDTO.getCena();
        double ilosc = zamowienieDTO.getIlosc();
        String typRabatu = zamowienieDTO.getTypRabatu();
        String klient = zamowienieDTO.getKlient();
        String produkt = zamowienieDTO.getProdukt();

        System.out.println("Przetwarzanie zamowienia dla: " + klient);


        double cenaPrzedObniżkaZnowuPolskieZnaki = cena * ilosc;
        Rabatowalny rabat = FabrykaRabatow.stworzRabat(typRabatu);
        double koncowaCena = rabat.obniż(cenaPrzedObniżkaZnowuPolskieZnaki);


        try {
            this.zapisywalne.zapisz(klient, produkt, koncowaCena);
            this.porozumiewalne.informuj(klient);
        } catch (IOException e) {
            System.out.println(e.getMessage() + " NowyLepszySystem jednak nie taki lepszy");;
        }

    }
}
