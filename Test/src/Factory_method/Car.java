package Factory_method;

public abstract class Car {

    private BodyTypes bodyType;
    private String model;
    private long modelYear;


    public abstract void create(Car car);

    @Override
    public String toString (){
        return  '\n' +"Тип кузова - " + bodyType + '\n' +
                "Модель - " + model + '\n' +
                "Модельный год:" + modelYear;
    }
}
