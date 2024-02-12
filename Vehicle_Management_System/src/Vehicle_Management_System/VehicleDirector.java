package Vehicle_Management_System;

/**
 * File Name: VehicleDirector.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This build pattern class directs the building process carried out by VehicleBuilder Implentations ensuring that the vehicle is built
 * through a defined sequence of steps.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see VehicleFactory.java, VehicleManager.java, Vehicle.java
 */

class VehicleDirector {
	 // Builder instance used for constructing a vehicle
	VehicleBuilder myBuilder;
	
	 /**
     * It ensures the vehicle is built by executing a series of build steps in order.
     * 
     * @param builder The VehicleBuilder implementation that specifies how the vehicle is built.
     * @return The constructed Vehicle object.
     */
	public Vehicle build(VehicleBuilder builder) {
		myBuilder = builder;
		myBuilder.buildEngine();
		myBuilder.buildWheels();
		myBuilder.buildColor();
        return builder.getVehicle();
	}


}