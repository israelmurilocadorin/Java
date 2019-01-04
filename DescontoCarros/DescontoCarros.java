package DescontoCarros;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DescontoCarros {
	
	public static void main(String[] args) {
		
		double carCost, discount, carDiscount;
		int carModel, carModel2000 = 0, defaultCar = 0;
		boolean toContinue = true;
		String decision;
		
		while(toContinue = true) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter value of car: ");
			carCost = in.nextDouble();
			
			System.out.println("Enter the car model: ");
			carModel = in.nextInt();
			
			if(carModel <= 2000) {
				discount = (carCost * 12)/100;
				carDiscount = carCost - discount;
				System.out.println("The car discount will be: " + discount + ".The car cost will be: " + carDiscount);
				carModel2000++;
			}
			if(carModel > 2000) {
				discount = (carCost * 7)/100;
				carDiscount = carCost - discount;
				System.out.println("The car discount will be: " + discount + ".The car cost will be: " + carDiscount);
				defaultCar++;
			}
			
			decision = JOptionPane.showInputDialog("Would you like to do another operation? Choice Y(yes) or N(no): ");
			
			if(decision.equals("y")) {
				System.out.println("New operation!");
			}else{
				System.out.println("You leave!");
				toContinue = false;
			}
		}
	}
}
