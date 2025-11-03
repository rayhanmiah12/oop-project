package controller;

import devices.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SmartHome {
    private ArrayList<Device> devices = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SmartHome app = new SmartHome();
        app.run();
    }

    private void run() {
        System.out.println("🏠 Welcome to Smart Home Device Controller 🏠");
        boolean exit = false;
        while (!exit) {
            showMenu();
            int choice = readInt();
            switch (choice) {
                case 1 -> addDeviceMenu();
                case 2 -> turnOnDevice();
                case 3 -> turnOffDevice();
                case 4 -> showAllDevices();
                case 5 -> removeDeviceMenu();
                case 6 -> {
                    System.out.println("Thank you for using Smart Home System!");
                    exit = true;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }

    private void showMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Add Device");
        System.out.println("2. Turn ON Device");
        System.out.println("3. Turn OFF Device");
        System.out.println("4. Show All Devices");
        System.out.println("5. Remove Device");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
    }

    private void addDeviceMenu() {
        System.out.println("Choose type: 1.Light  2.Fan  3.AC  4.Door");
        int type = readInt();
        System.out.print("Enter device name: ");
        String name = sc.next();
        Device d = null;
        if (type == 1) d = new Light(name);
        else if (type == 2) d = new Fan(name);
        else if (type == 3) d = new AC(name);
        else if (type == 4) d = new Door(name);

        if (d != null) {
            devices.add(d);
            System.out.println(name + " added successfully!");
        } else {
            System.out.println("Invalid device type!");
        }
    }

    private void turnOnDevice() {
        if (devices.isEmpty()) {
            System.out.println("No devices. Add first.");
            return;
        }
        printDeviceList();
        System.out.print("Enter device index to turn ON: ");
        int idx = readInt();
        if (validIndex(idx)) devices.get(idx).turnOn();
        else System.out.println("Invalid index!");
    }

    private void turnOffDevice() {
        if (devices.isEmpty()) {
            System.out.println("No devices. Add first.");
            return;
        }
        printDeviceList();
        System.out.print("Enter device index to turn OFF: ");
        int idx = readInt();
        if (validIndex(idx)) devices.get(idx).turnOff();
        else System.out.println("Invalid index!");
    }

    private void showAllDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices added yet.");
            return;
        }
        System.out.println("=== Devices ===");
        for (int i = 0; i < devices.size(); i++) {
            System.out.print(i + ". ");
            devices.get(i).showStatus();
        }
    }

    private void removeDeviceMenu() {
        if (devices.isEmpty()) {
            System.out.println("No devices to remove.");
            return;
        }
        printDeviceList();
        System.out.print("Enter device index to remove: ");
        int idx = readInt();
        if (validIndex(idx)) {
            System.out.println(devices.get(idx).getName() + " removed.");
            devices.remove(idx);
        } else {
            System.out.println("Invalid index!");
        }
    }

    private void printDeviceList() {
        for (int i = 0; i < devices.size(); i++) {
            System.out.println(i + ". " + devices.get(i).getName());
        }
    }

    private boolean validIndex(int idx) {
        return idx >= 0 && idx < devices.size();
    }

    private int readInt() {
        while (!sc.hasNextInt()) {
            sc.next(); // discard invalid
            System.out.print("Please enter a number: ");
        }
        return sc.nextInt();
    }
}
