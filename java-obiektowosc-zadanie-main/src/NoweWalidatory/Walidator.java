package NoweWalidatory;

public abstract class Walidator {
    protected Walidator next;

    protected Walidator(Walidator next) {
        this.next = next;
    }

    public void invokeNext(ZamowienieDTO zamowienieDTO){
        if ( next != null){
            next.validate(zamowienieDTO);
        }
    }

    public abstract void validate(ZamowienieDTO zamowienieDTO);

    public void setNext(Walidator next){
        this.next = next;
    }
}
