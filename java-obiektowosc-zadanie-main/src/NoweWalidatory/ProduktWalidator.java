package NoweWalidatory;

public class ProduktWalidator extends Walidator{
    public ProduktWalidator(Walidator next) {
        super(next);
    }

    @Override
    public void validate(ZamowienieDTO zamowienieDTO) {
        double cena = zamowienieDTO.getCena();
        int ilosc = zamowienieDTO.getIlosc();

        if ( cena <= 0 ) {
            throw new IllegalArgumentException("Cena musi byc dodatnia!");
        }

        if ( ilosc <= 0 ) {
            throw new IllegalArgumentException("Ilosc musi byc dodatnia!");
        }
        invokeNext(zamowienieDTO);
    }
}
