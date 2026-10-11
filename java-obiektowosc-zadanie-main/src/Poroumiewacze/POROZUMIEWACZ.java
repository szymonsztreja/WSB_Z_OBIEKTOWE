package Poroumiewacze;

import java.io.FileWriter;
import java.io.IOException;

public class POROZUMIEWACZ implements Porozumiewalne{
    @Override
    public void informuj(String klient) {
        System.out.println("Wysyłanie powiadomienia email na adres: " + klient + "@student.wsb.pl");
    }
}
