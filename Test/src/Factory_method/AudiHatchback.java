package Factory_method;

public class AudiHatchback extends Car{
    private BodyTypes bodyType;
    private String model;
    private long modelYear;

    public AudiHatchback(BodyTypes bodyType, String model, long modelYear) {
        this.bodyType = bodyType;
        this.model = model;
        this.modelYear = modelYear;
    }

    @Override
    public void create(Car car){
        System.out.println("Your car created"+car);
    }
    @Override
    public String toString (){
        return  '\n' +"Тип кузова - " + bodyType + '\n' +
                "Модель - " + model + '\n' +
                "Модельный год:" + modelYear;
    }
}
