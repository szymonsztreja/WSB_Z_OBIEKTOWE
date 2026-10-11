package Zapisywacze;

import java.io.IOException;

public interface Zapisywalne{
    void zapisz(String klient, String produkt, double koncowaCena) throws IOException;
}
