package behavioral.mediator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        var button = new Button();
        var fan = new Fan();
        var powerSupplier = new PowerSupply();

        var mediator = new Mediator();

        mediator.setFan(fan);
        mediator.setButton(button);
        mediator.setPowerSupplier(powerSupplier);

        Assertions.assertFalse(fan.isOn());

        button.press();
        Assertions.assertTrue(fan.isOn());

        button.press();
        Assertions.assertFalse(fan.isOn());
    }

}
