📘 Project Overview
Smart Home Device Controller is a Java console-based OOP project that simulates controlling home devices such as Lights, Fans, ACs, and Doors. The user can turn devices ON/OFF, check their status, and manage multiple devices from a single menu system.

This project is made to demonstrate Object-Oriented Programming (OOP) concepts — Abstraction, Encapsulation, Inheritance, and Polymorphism.

⚙️ Features
✅ Turn ON/OFF different smart devices ✅ Show current status of all devices ✅ Menu-driven system (console-based) ✅ Demonstrates all 4 OOP pillars ✅ Simple, clear, and beginner-friendly structure

🧠 OOP Concepts Used
OOP Concept	Implementation
Encapsulation	Each device keeps its own private state (name, isOn)
Inheritance	Light, Fan, AC, and Door inherit from abstract class Device
Polymorphism	turnOn() and turnOff() methods are overridden in subclasses
Abstraction	Abstract class Device defines general methods for all devices
🏗️ Project Structure
src/
 └── com/
     └── smarthome/
         ├── controller/
         │    └── SmartHome.java
         └── devices/
              ├── Device.java
              ├── Light.java
              ├── Fan.java
              ├── AC.java
              └── Door.java
▶️ How to Run
Open the project in IntelliJ IDEA (or any Java IDE).
Make sure all .java files are under the correct package path.
Run the file: SmartHome.java.
Follow the console instructions.
💡 Example Output
🏠 Welcome to Smart Home Device Controller 🏠

1. Turn ON a device
2. Turn OFF a device
3. Show all device status
4. Exit
Enter choice: 1

Available devices:
1. Light
2. Fan
3. AC
4. Door
Enter your choice: 2

🌀 Fan is now ON.
👨‍💻 Author
Name: Rayhan Miah 
Course: Object-Oriented Programming (Java)
Semester: 3rd University Project

🏁 Purpose
This project is created for OOP Lab Final to practically demonstrate how real-world smart systems can be modeled using Java OOP concepts.
