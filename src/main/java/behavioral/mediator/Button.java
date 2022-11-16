package behavioral.mediator;

public class Button {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        System.out.println("Button pressed!");
        mediator.press();
    }
}