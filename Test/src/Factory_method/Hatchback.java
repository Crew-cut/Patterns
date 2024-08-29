package Factory_method;

public class Hatchback extends Car {
    private int id;
    private String bodyType;
    private String model;
    private long modelYear;


    public Hatchback(BodyTypes bodyType, String model, long modelYear) {
        super(bodyType, model, modelYear);
        this.id = Car.id;
    }

    @Override
    public void create(){

    }

}
