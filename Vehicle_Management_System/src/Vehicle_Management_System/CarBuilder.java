package Vehicle_Management_System;
/**
 * File Name: CarBuilder.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This is a CONCRETE Builder Pattern for car. It constructs a Car object step by step, setting its engine, wheels, and color.
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see 
 */

class CarBuilder implements VehicleBuilder{
	
	 private Car car;

	    /**
	     * Constructor initializing a new Car object.
	     */
	    public CarBuilder() {
	        this.car = new Car();
	    }

	    /**
	     * Sets the engine of the Car
	     */
	    @Override
	    public void buildEngine() {
	        car.setEngine("Car Engine");
	    }
	    
	    /**
	     * Sets the number of wheels for the Car to four.
	     */
	    @Override
	    public void buildWheels() {
	        car.setWheels(4);
	    }
	    
	    /**
	     * Sets the color of the Car.
	     */
	    @Override
	    public void buildColor() {
	        car.setColor("Blue");
	    }
	    
	    /**
	     * Returns the fully constructed Car object.
	     * 
	     * @return The built Car object.
	     */
	    @Override
	    public Vehicle getVehicle() {
	        return car;
	    }
	}