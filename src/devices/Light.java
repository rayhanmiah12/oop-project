package devices;

public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is glowing brightly!");
    }
}
