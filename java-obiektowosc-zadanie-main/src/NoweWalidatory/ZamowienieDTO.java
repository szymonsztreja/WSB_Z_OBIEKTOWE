package NoweWalidatory;

public class ZamowienieDTO {
    private String klient;
    private String produkt;
    private double cena;
    private int ilosc;
    private String typRabatu;

    public ZamowienieDTO(String klient, String produkt, double cena, int ilosc, String typRabatu) {
        this.klient = klient;
        this.produkt = produkt;
        this.cena = cena;
        this.ilosc = ilosc;
        this.typRabatu = typRabatu;
    }

    public String getKlient() {
        return this.klient;
    }

    public double getCena() {
        return this.cena;
    }

    public int getIlosc() {
        return this.ilosc;
    }

    public String getTypRabatu(){return this.typRabatu;}

    public String getProdukt() {
        return this.produkt;
    }


}
