package Vehicle_Management_System;

/**
 * File Name: VehicleFactory.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This is a Simple Factory Pattern class that generates vehicle objects based on the specific type.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see VehicleManager.java, VehicleDirector.java, Vehicle.java
 */

public class VehicleFactory {
    /**
     * Creates and returns a vehicle object based on the input type.
     * 
     * @param type The type of vehicle to create, e.g., "car" or "motorcycle".
     * @return A constructed Vehicle object or null if the type is not supported.
     */
    public static Vehicle createVehicle(String type) {
        VehicleBuilder builder;
        VehicleDirector director = new VehicleDirector();

        // I used switch case to get the value for "car" and "motorcycle" if it's none of those two values, it returns null
        switch (type.toLowerCase()) {
            case "car":
                builder = new CarBuilder();
                return director.build(builder);
                
            // Use MotorcycleBuilder for "motorcycle" type
            case "motorcycle":
                builder = new MotorcycleBuilder();
                return director.build(builder);
            default:
                return null; // Return null if the type does not match
        }
    }
}