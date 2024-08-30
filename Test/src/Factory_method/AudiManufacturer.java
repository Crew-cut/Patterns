package Factory_method;

public class AudiManufacturer extends CarManufacturer{

    @Override
    public Car createCar(BodyTypes bodyTypes) {
        Car car = null;
        switch (bodyTypes){
            case SEDAN -> car = new AudiSedan(bodyTypes, "A4", 2020);
            case WAGON -> car = new AudiWagon(bodyTypes,"A6", 2021);
            case HATCHBACK ->  car = new AudiHatchback(bodyTypes, "A3", 2022);
            default -> System.out.println("nothing to do");
        }
        return car;
    }
}
