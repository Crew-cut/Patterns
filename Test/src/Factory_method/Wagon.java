package Factory_method;

public class Wagon extends Car {
    private int id;
    private String bodyType;
    private String model;
    private long modelYear;


public Wagon(BodyTypes bodyType, String model, long modelYear) {
        super(bodyType, model, modelYear);
        this.id = Car.id;
    }

    @Override
    public void create(){

    }
}
