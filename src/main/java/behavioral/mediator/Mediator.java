package behavioral.mediator;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }

    public void setPowerSupplier(PowerSupply powerSupplier) {
        this.powerSupply = powerSupplier;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupply.turnOn();
    }

    public void stop() {
        powerSupply.turnOff();
    }
}
