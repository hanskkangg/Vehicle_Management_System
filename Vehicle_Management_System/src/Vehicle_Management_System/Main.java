package Vehicle_Management_System;

public class Main {
    public static void main(String[] args) {
        // Singleton instance of VehicleManager
        VehicleManager manageVehicle = VehicleManager.getInstance();

        // Create vehicles using the Factory
        Vehicle car = VehicleFactory.createVehicle("Car");
        Vehicle motorcycle = VehicleFactory.createVehicle("Motorcycle");

        // Add vehicles to the vehicle manager
        manageVehicle.addVehicle(car);
        manageVehicle.addVehicle(motorcycle);


        //display information about vehicles
        System.out.println("Vehicles:");
        for (Vehicle vehicle : manageVehicle.getVehicles()) {
            // Display vehicle informations
            System.out.println("------------------------------------------");
            System.out.println("Type: " + vehicle.getClass().getSimpleName());
            System.out.println("Engine: " + vehicle.getEngine());
            System.out.println("Wheels: " + vehicle.getWheels());
            System.out.println("Color: " + vehicle.getColor());
        }
    }
    
}
