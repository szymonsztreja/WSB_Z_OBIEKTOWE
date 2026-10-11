package Rabats;

public class RabatJakis implements Rabatowalny{
    @Override
    public double obniż(double cenaRegularna) {
        double obniżka = 0.9;
        return obniżka * cenaRegularna;
    }
}
