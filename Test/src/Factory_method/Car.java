package Factory_method;

public abstract class Car {

    private BodyTypes bodyType;
    private String model;
    private long modelYear;
    public abstract void create(Car car);
}
