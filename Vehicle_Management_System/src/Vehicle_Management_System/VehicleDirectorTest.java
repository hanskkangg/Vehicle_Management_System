package Vehicle_Management_System;

import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * * Tests to make sure the VehicleDirector class builds vehicles right using the Builder pattern.
 */
public class VehicleDirectorTest {
	
    /**
     * Tests the vehicle construction process to ensure a Vehicle object
     * is correctly built using a CarBuilder.
     */
    @Test
    public void testVehicleBuilding() {
        // Use CarBuilder to construct a Car object
        VehicleBuilder builder = new CarBuilder();
        VehicleDirector director = new VehicleDirector();
        
        // Build the vehicle using the director
        Vehicle vehicle = director.build(builder);

        // Check that the constructed vehicle is not null
        assertNotNull("Vehicle shuoldn't be null", vehicle);
        // Verify that the vehicle is indeed an instance of Car
        assertTrue("Vehicle is indeed an instance of Car", vehicle instanceof Car);
    }
}
