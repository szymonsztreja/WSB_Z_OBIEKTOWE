package NoweWalidatory;

public class KlientWalidator extends Walidator {

    public KlientWalidator(Walidator next) {
        super(next);
    }

    @Override
    public void validate(ZamowienieDTO zamowienieDTO) {
        String klient = zamowienieDTO.getKlient();

        if (klient == null || klient.isBlank()) {
            throw new IllegalArgumentException("Klient nie moze byyc zerooo!");
        }

        invokeNext(zamowienieDTO);
    }
}