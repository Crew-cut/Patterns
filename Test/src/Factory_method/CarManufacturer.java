package Factory_method;

public abstract class CarManufacturer {
    public Car produce (BodyTypes bodyTypes){
        Car car = createCar(bodyTypes);
        car.create(car);
        return car;
    }
    public abstract Car createCar (BodyTypes bodyTypes);
}
