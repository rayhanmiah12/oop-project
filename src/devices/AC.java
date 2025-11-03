package devices;

public class AC extends Device {
    public AC(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is cooling the room.");
    }
}
