package Vehicle_Management_System;
/**
 * File Name: VehicleManager.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description:This is a CONCRETE Builder Pattern for Motorcycle. It constructs a Car object step by step, setting its engine, wheels, and color.
 * 
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see 
 */

public class MotorcycleBuilder implements VehicleBuilder {
    private Motorcycle motorcycle;
    /**
     * Constructor initializing a new motorcycle object
     */
    public MotorcycleBuilder() {
        this.motorcycle = new Motorcycle();
    }
    /**
     * Sets the engine of the motorcycle to Motorcycle engine
     */
    @Override
    public void buildEngine() {
        motorcycle.setEngine("Motorcycle Engine");
    }
    /**
     * Sets the number of wheels for the motorcycle to two.
     */
    @Override
    public void buildWheels() {
        motorcycle.setWheels(2); 
    }
    /**
     * Sets the color of the Motorcycle.
     */
    @Override
    public void buildColor() {
        motorcycle.setColor("Red");
    }

    /**
     * Returns the fully constructed motorcycle object.
     * 
     * @return The built Car object.
     */
    @Override
    public Vehicle getVehicle() {
        return motorcycle;
    }
}
