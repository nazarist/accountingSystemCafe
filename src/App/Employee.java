package App;

public class Employee {
    private static String name;
    private String position;
    private String schedule;

    public Employee(String name, String position, String schedule) {
        this.name = name;
        this.position = position;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
