import Adapter.Phone;
import Adapter.Plug;
import Adapter.PowerSupplyUnit;
import Factory_method.*;
import State.State;
import State.State1;
import State.MyContext;

public class Main {
    public static void main(String[] args) {
        //Factory
        CarManufacturer audi = new AudiManufacturer();
        audi.produce(BodyTypes.HATCHBACK);
        CarManufacturer vag = new VAGManufacturer();
        vag.produce(BodyTypes.HATCHBACK);
        //Adapter
        Plug psu = new PowerSupplyUnit(new Phone());
        psu.plug();
        psu.unplug();
        //State
        State state = new State1();
        MyContext context = new MyContext(state);
        context.doAction();
        context.nextState();
        context.nextState();
    }
}