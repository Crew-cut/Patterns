package Factory_method;

public class CarManufacturer {
    private final Factory factory;

    public CarManufacturer(Factory factory) {
        this.factory = factory;
    }

    public Car produce (BodyTypes bodyTypes){
        Car car = factory.createCar(bodyTypes);
        car.create();
        System.out.println("Your car created");
        return car;
    }
}
