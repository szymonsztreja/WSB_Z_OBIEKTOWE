package Rabats;

public class RabatStudety implements Rabatowalny{
    @Override
    public double obniż(double cenaRegularna) {
        double obinżka = 0.5;
        return obinżka * cenaRegularna;
    }
}
