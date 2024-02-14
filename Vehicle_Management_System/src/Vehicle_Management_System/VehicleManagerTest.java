package Vehicle_Management_System;

import static org.junit.Assert.*;
import org.junit.Test;



/**
 * Tests for the VehicleManager class to ensure it functions correctly.
 * This includes testing the singleton pattern implementation and 
 * the ability to add and retrieve vehicles.
 */
public class VehicleManagerTest {


	  /**
     * Test to verify that VehicleManager is a singleton.
     * This means only one instance of VehicleManager should exist.
     */
    @Test
    public void testSingletonInstance() {

        // Get two instances of VehicleManager
        VehicleManager instance1 = VehicleManager.getInstance();
        VehicleManager instance2 = VehicleManager.getInstance();
        
     // Check if both instances are the same, proving it's a singleton
        assertSame("instance1 and instance2 should match!", instance1, instance2);
    }

    /**
     * Test to verify vehicles can be added and retrieved from VehicleManager.
     */
    @Test
    public void testAddAndGetVehicles() {

        // Get the singleton instance of VehicleManager
        VehicleManager manageVehicle = VehicleManager.getInstance();
        
        // Create a new car and add it to the manageVehicle
        Vehicle car = new Car(); // Assuming Car is a concrete class that implements Vehicle
        manageVehicle.addVehicle(car);


        // Check if the vehicle list contains exactly one vehicle
        assertEquals("Vehicle list should contain 1 vehicle", 1, manageVehicle.getVehicles().size());
        // Verify the vehicle added is the same as the one we can get
        assertSame("The vehicle should be the one we added", car, manageVehicle.getVehicles().get(0));
    }
}
