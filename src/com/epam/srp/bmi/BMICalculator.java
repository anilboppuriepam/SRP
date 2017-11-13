package com.epam.srp.bmi;

public class BMICalculator implements ICalculate {

	
	 private double height;
	 private double weight;
	 private double heightInMeters;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeightInMeters() {
		return heightInMeters;
	}
	public void setHeightInMeters(double heightInMeters) {
		this.heightInMeters = heightInMeters;
	}
	 
	 public double calculate(){
		 
		 double heightSquare = Math.pow(this.height,2);
		 return (this.weight / heightSquare);
	 }
}
