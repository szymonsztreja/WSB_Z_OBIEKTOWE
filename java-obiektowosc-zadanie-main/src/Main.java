import NoweWalidatory.KlientWalidator;
import NoweWalidatory.ProduktWalidator;
import NoweWalidatory.ZamowienieDTO;
import Poroumiewacze.POROZUMIEWACZ;
import Rabats.FabrykaRabatow;
import Rabats.RabatStudety;
import Walidaory.WALIDATOR;
import Walidaory.Waildatowalny;
import Zapisywacze.ZAPISYWACZ;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        SystemZamowien system = new SystemZamowien();
//        system.procesuj("Jan Kowalski", "Kurs Java", 100.0, 2, "STUDENT");

        ZamowienieDTO zamowienieDTO = new ZamowienieDTO("Jan Kowalski", "Kurs Java", 100.0, 2, "STUDENT");
        ZamowienieDTO blankKlient = new ZamowienieDTO("", "Kurs Java", 100.0, 2, "STUDENT");
        ZamowienieDTO negativePrice = new ZamowienieDTO("Jan Kowalski", "Kurs Java", -1, 2, "STUDENT");

        NowyLepszySystemZamówieńZPolskimiZnakami systemTM = new NowyLepszySystemZamówieńZPolskimiZnakami(
                new KlientWalidator(new ProduktWalidator(null)),
                new ZAPISYWACZ(),
                new POROZUMIEWACZ()
        );

        System.out.println("#### TESTOWANIE ####");

        systemTM.procesujZamowienie(zamowienieDTO);
        System.out.println("-----------------------------");
        systemTM.procesujZamowienie(blankKlient);
        System.out.println("-----------------------------");
        systemTM.procesujZamowienie(negativePrice);
    }
}