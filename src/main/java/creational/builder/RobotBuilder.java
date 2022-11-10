package creational.builder;

public final class RobotBuilder {
    private String name;
    private String level;
    private int robotCode;

    private RobotBuilder() {
    }

    public static RobotBuilder aRobot() {
        return new RobotBuilder();
    }

    public RobotBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public RobotBuilder withLevel(String level) {
        this.level = level;
        return this;
    }

    public RobotBuilder withRobotCode(int robotCode) {
        this.robotCode = robotCode;
        return this;
    }

    public Robot build() {
        Robot robot = new Robot();
        robot.setName(name);
        robot.setLevel(level);
        robot.setRobotCode(robotCode);
        return robot;
    }
}
