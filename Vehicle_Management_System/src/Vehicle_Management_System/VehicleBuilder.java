package Vehicle_Management_System;
/**
 * File Name: VehicleBuilder.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This class is an interface that define the blueprint for building vehicle object
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see 
 */

interface VehicleBuilder {
	
	 /**
     * Builds the engine part of the vehicle.
     */
	void buildEngine();
	
	  /**
     * Builds the wheels part of the vehicle.
     */
	void buildWheels();
	
	 /**
     * Sets the color of the vehicle.
     */
	void buildColor();
	
    /**
     * Returns the fully constructed vehicle object.
     * 
     * @return The built vehicle.
     */
	Vehicle getVehicle();

}