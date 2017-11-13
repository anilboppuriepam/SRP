package com.epam.srp.bmi.client;

import java.util.Scanner;

import com.epam.srp.bmi.BMICalculator;
import com.epam.srp.bmi.BMICategory;

public class Client {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
            System.out.println("********* UR Health BMI Calculator *********** \n");

            System.out.println("********* BMI Categories *********** \n");
            System.out.println(" Under Weight =< 18.5 \n Normal Weight > 18.5 And <= 24.9 \n Overweight > 25 And <= 29.9 \n Obesity >=30\n");
            System.out.println("********* End of BMI Categories *********** \n");

            BMICalculator bmiCalculator = new BMICalculator();

            System.out.println("Enter weight in Kilog grams...");
            
            

            double weightInKg = scanner.nextDouble();
        

            System.out.println("Enter height in Meters...");

            double heightInMeters = scanner.nextDouble();
            
            bmiCalculator.setWeight(weightInKg);
            bmiCalculator.setHeightInMeters( heightInMeters);

            double BMI = (double)Math.round(bmiCalculator.calculate());

            System.out.printf("Your BMI is : %f  && BMI Category : %f", BMI, BMICategory.getBMICategory(BMI));

            System.out.println("*********  ***********");
            scanner.next();

        

	}

}
