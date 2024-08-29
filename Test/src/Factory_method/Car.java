package Factory_method;

import java.util.Date;

public class Car {
    static int id = 0;
    private BodyTypes bodyType;
    private String model;
    private long modelYear;

    public Car (BodyTypes bodyType, String model, long modelYear){
        id ++;
        this.bodyType = bodyType;
        this.model = model;
        this.modelYear = modelYear;
    }

    public void create(){

    }
}
