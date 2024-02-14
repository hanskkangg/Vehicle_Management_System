package Vehicle_Management_System;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the VehicleFactory class to ensure it correctly creates vehicle objects.
 * This class verifies that the VehicleFactory can create specific types of vehicles
 * like cars and motorcycles, and also handles invalid requests properly.
 */
public class VehicleFactoryTest {
	
	 /**
     * Test to ensure a Car object is correctly created when "car" is requested.
     */
    @Test
    public void testCreateCar() {
    	//Create a car using factory
        Vehicle vehicle = VehicleFactory.createVehicle("car");
        
        // Ensure the returned object is not null, meaning creation was successful
        assertNotNull("This shouldn't be null!", vehicle);
        // Check if the created vehicle is actually an instance of Car
        assertTrue("Vehicle has to be an instance of car", vehicle instanceof Car);
    }

    /**
     * Test to ensure a Motorcycle object is correctly created when "motorcycle" is requested.
     */
    @Test
    public void testCreateMotorcycle() {

    	//Create a motorcycle using factory
        Vehicle vehicle = VehicleFactory.createVehicle("motorcycle");

        // Ensure the returned object is not null, meaning creation was successful
        assertNotNull("This shouldn't be null!", vehicle);
        // Check if the created vehicle is actually an instance of motorcycle.
        assertTrue("Vehicle should be instance of Motorcycle", vehicle instanceof Motorcycle);
    }

    /**
     * Test to ensure that requesting an invalid vehicle type results in null.
     */
    @Test
    public void testInvalidVehicleType() {
    	//creating an invalid type 
        Vehicle vehicle = VehicleFactory.createVehicle("invalid");

        // Check that no vehicle is created for invalid types, expecting null
        assertNull("This has to be null for invalid values", vehicle);
    }
}
