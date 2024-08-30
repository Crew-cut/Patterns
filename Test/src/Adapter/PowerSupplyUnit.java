package Adapter;

public class PowerSupplyUnit implements Plug {

    boolean plugged;
    private Phone phone;
    public PowerSupplyUnit(Phone phone) {
        this.phone = phone;
    }
    public void charge () {
        this.phone.charge(plugged);
    }
    public void chargeEnd() {
        this.phone.charge(plugged);
    }

    @Override
    public boolean isPlugged() {
        return plugged;
    }

    @Override
    public void plug() {
        plugged = true;
        charge();
    }

    @Override
    public void unplug() {
        plugged = false;
        chargeEnd();
    }
}
