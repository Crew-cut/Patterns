import Adapter.Phone;
import Adapter.Plug;
import Adapter.PowerSupplyUnit;
import Factory_method.*;

public class Main {
    public static void main(String[] args) {
        //Factory
//        CarManufacturer audi = new AudiManufacturer();
//        audi.produce(BodyTypes.HATCHBACK);
//        CarManufacturer vag = new VAGManufacturer();
//        vag.produce(BodyTypes.HATCHBACK);
        //Adapter
        Plug psu = new PowerSupplyUnit(new Phone());
        psu.plug();
        psu.unplug();
        //Store.State
    }
}