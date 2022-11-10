package creational.singleton;

public class SingletonExample {
    public static void run() {

        Validator bobValidator = Validator.getInstance();

        bobValidator.validateData("Bob2");

        assert Validator.getInstance() == bobValidator;


    }
}
