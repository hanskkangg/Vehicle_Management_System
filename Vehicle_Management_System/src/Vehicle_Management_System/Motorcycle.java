package Vehicle_Management_System;
/**
 * File Name: Motorcycle.java
 * Student Name: Hans Kang, 040694631
 * Professor: Gustavo Adami
 * Due Date: Feb 11, 2024
 * Modified: Feb 6, 2024
 * Description: This Motorcycle class implements the Vehicle interface, providing concrete implementations 
 * 
 * @author Hans Kang
 * @version 17.0.7
 * @since javaSE-17
 * @see 
 */

public class Motorcycle implements Vehicle{
	
	 private String engine;
	 private int wheels;
	 private String color;
	 
	 /**
	  * Starts the Motorcycle
	  */
	 @Override
	 public void start() {
	     System.out.println("Motorcycle has started");
	 }
	 
	 /**
	  * Stops the Motorcycle
	  */
	 @Override
	 public void stop() {
	     System.out.println("Motorcycle has stopped");
	 }

	 /**
	  * Retrieves the engine type of the car.
	  * 
	  * @return A string representing the type of engine the car has.
	  */
	 @Override
	 public String getEngine() {
	     return engine;
	 }
	 
	 /**
	  * Sets the engine type of the car.
	  * 
	  * @param engine A string specifying the type of engine.
	  */
	 @Override
	 public void setEngine(String engine) {
	     this.engine = engine;
	 }
	 
	 /**
	  * Retrieves the number of wheels on the car.
	  * 
	  * @return An integer representing the number of wheels on the car.
	  */
	 @Override
	 public int getWheels() {
	     return wheels;
	 }
	 
	 /**
	  * Sets the number of wheels on the car.
	  * 
	  * @param wheels An integer specifying the number of wheels on the car.
	  */

	 @Override
	 public void setWheels(int wheels) {
	     this.wheels = wheels;
	 }
	 
	 /**
	  * Retrieves the color of the car.
	  * 
	  * @return A string representing the color of the car.
	  */
	 @Override
	 public String getColor() {
	     return color;
	 }
	 
	 /**
	  * Sets the color of the car.
	  * 
	  * @param color A string specifying the color of the car.
	  */
	 public void setColor(String color) {
	     this.color = color;
	 }
	}