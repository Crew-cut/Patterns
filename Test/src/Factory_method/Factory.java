package Factory_method;

import java.util.Date;

public class Factory {

    public Car createCar(BodyTypes bodyTypes) {
        Car car = null;
        switch (bodyTypes){
            case SEDAN -> car = new Sedan(bodyTypes, "Jetta", 2015);
            case WAGON -> car = new Wagon(bodyTypes,"Passat", 2016);
            case HATCHBACK ->  car = new Hatchback(bodyTypes, "Golf", 2019);
            default -> System.out.println("nothing to do");
        }
        return car;
    }

//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "id='" + id + '\'' +
//                ", Brand of car='" + carBrand + '\'' +
//                ", model=" + model +
//                ", Date of construct=" + dateOfConstruct +
//                '}';
//    }
}
