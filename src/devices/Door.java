package devices;

public class Door extends Device {
    public Door(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is now unlocked.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println(name + " is now locked.");
    }
}
