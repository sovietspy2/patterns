package creational.builder;

public class BuilderExample {
    public static void run() {

        Robot robot = RobotBuilder.aRobot()
                .withName("Name")
                .withRobotCode(123)
                .build();

    }
}
