package Factory_method;

public class VAGManufacturer extends CarManufacturer{

    @Override
    public Car createCar(BodyTypes bodyTypes) {
        Car car = null;
        switch (bodyTypes){
            case SEDAN -> car = new VAGSedan(bodyTypes, "Jetta", 2015);
            case WAGON -> car = new VAGWagon(bodyTypes,"Passat", 2016);
            case HATCHBACK ->  car = new VAGHatchback(bodyTypes, "Golf", 2019);
            default -> System.out.println("nothing to do");
        }
        return car;
    }
}
