import Factory_method.*;

public class Main {
    public static void main(String[] args) {
        CarManufacturer audi = new AudiManufacturer();
        audi.produce(BodyTypes.HATCHBACK);

        CarManufacturer vag = new VAGManufacturer();
        vag.produce(BodyTypes.HATCHBACK);
    }
}