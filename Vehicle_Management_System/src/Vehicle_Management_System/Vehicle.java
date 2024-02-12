package Vehicle_Management_System;

/**
 * File Name: Vehicle.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This interface defines methods for vehicles.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see VehicleManager.java, VehicleDirector.java,VehicleFactory.java
 */
public interface Vehicle {
	
	//Common methods for all vehicles
	void start();
	void stop();
	
	//Common attributes for all vehicles
	String getEngine();
	void setEngine(String Engine);

	int getWheels();
	void setWheels(int Wheels);
	
	String getColor();
	void setColor(String Color);
	
}
