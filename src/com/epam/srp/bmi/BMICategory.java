package com.epam.srp.bmi;

public class BMICategory {

	public static String getBMICategory(double bmiValue){
		
		  String bmiCategory = null;
		  if(bmiValue < 18.5)
			  bmiCategory = "Under Weight";
		  else if(bmiValue > 18.5 && bmiValue <=24.9)
			  bmiCategory = "Normal Weight";
		  else if(bmiValue > 25  &&  bmiValue <= 29.9 )
			  bmiCategory = "Over Weight";
		  else
			   bmiCategory ="Obesity";
		  return bmiCategory;
		
	} 
	
}
