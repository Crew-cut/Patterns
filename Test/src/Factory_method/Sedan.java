package Factory_method;

public class Sedan extends Car {

    private int id;
    private String bodyType;
    private String model;
    private long modelYear;

    public Sedan(BodyTypes bodyType, String model, long modelYear) {
        super(bodyType, model, modelYear);
        this.id = Car.id;
    }

    @Override
    public void create(){

    }
}
