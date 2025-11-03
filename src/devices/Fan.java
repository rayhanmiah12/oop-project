package devices;

public class Fan extends Device {
    public Fan(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is spinning!");
    }
}
