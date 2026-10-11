package Rabats;

public class FabrykaRabatow {
    public static Rabatowalny stworzRabat(String typRabatu){
        if ( typRabatu == null) return null;

        return switch (typRabatu){
            case "STUDENT" -> new RabatStudety();
            case "STALY" -> new RabatJakis();
            default -> new BrakRabatu();
        };
    }
}
