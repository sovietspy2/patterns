package behavioral.mediator;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        System.out.println(this);
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    @Override
    public String toString() {
        return "Fan{" +
                "mediator=" + mediator +
                ", isOn=" + isOn +
                '}';
    }
}