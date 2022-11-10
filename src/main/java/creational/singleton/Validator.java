package creational.singleton;

public class Validator {

    private static Validator instance;

    private String name;

    private Validator() {
        name = "Bob";
    }

    public static Validator getInstance() {
        if (instance == null) {
            instance = new Validator();
        }
        return instance;
    }

    public boolean validateData(String data) {

        boolean valid = true;

        if (data== null){
            System.out.println("I's null!");
            valid = false;
        }
        if (!name.equals(data)) {
            System.out.println("Its not Bob!");
            valid = false;
        }
        return valid;
    }


}
