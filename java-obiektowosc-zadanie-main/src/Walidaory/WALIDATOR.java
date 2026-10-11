package Walidaory;

public class WALIDATOR implements Waildatowalny{
    @Override
    public void waliduj(String klient, double cena, int ilosc) {

        if(klient == null || klient.isBlank()){
            throw new IllegalArgumentException("Klient nie może być pusty, pisze kod językiem polskim");
        }
        if(cena <= 0) {
           throw new IllegalArgumentException("Cena musi być pozytywna, jak Ja");
        }
        if(ilosc <= 0){
            throw new IllegalArgumentException("Ilosc = 0! Musi coś tu być");
        }
    }
}
