package Adapter;

public class Phone {
    boolean Charging;
    public Phone() {
    }

    public void charge (boolean plugged){
        if (plugged){
            System.out.println("Phone is charging");
        }else System.out.println("Phone work on battery");
    }

}
