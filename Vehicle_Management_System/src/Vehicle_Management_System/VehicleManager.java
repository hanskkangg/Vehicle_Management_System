package Vehicle_Management_System;
import java.util.ArrayList;
import java.util.List;

/**
 * File Name: VehicleManager.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This class works as a Singleton Pattern.
 * It serves as the sole instance of VehicleManager, responsible for managing all vehicles in the system.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see VehicleFactory.java, VehicleDirector.java, Vehicle.java
 */

public class VehicleManager {
	
	//Singleton instance
	private static VehicleManager instance;
	
	//Array List to store vehicles
	private List<Vehicle> vehicles;
	
	
	//private constructor so that it's secured from outside the class
	private VehicleManager() {
		//initialize the list of vehicles
		vehicles = new ArrayList<>();
	}
	
	//It's a method to get the singleton instance 
	public static VehicleManager getInstance() {
		
		//if instance is NULL then create new one
		if (instance==null) {
			instance = new VehicleManager();
			}
		//return the singleton instance
		return instance;
	}
	
	//it's a method to add vehicle to the list 
	public void addVehicle(Vehicle vehicle) {
		//add vehicle to the list.
		vehicles.add(vehicle);
	}
	
	//Method to get vehicles in our stored array list
	public List<Vehicle> getVehicles(){
		//return the list of vehicles.
		return vehicles;
	}
}
