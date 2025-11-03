package devices;

import controllable.Controllable;

public class Device implements Controllable {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned OFF.");
    }

    @Override
    public void showStatus() {
        System.out.println(name + " status: " + (isOn ? "ON" : "OFF"));
    }

    public String getName() {
        return name;
    }
}
