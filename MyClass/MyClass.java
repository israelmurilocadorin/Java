package MyClass;

import java.util.Scanner;

public class MyClass {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean toContinue = true;
		
		do {
			
			System.out.printf("Enter the number: ");
			int number = in.nextInt();
			System.out.println();
			
			System.out.println("numero digitado: " + number);
			
			for(int counter = 1; counter <= number; counter++) {
				for(int counter2 = 1; counter2 <= counter; counter2++) {
					System.out.print(counter);
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.printf("New operation? [y] or [n]: ");
			String option = in.next();
			System.out.println();
			
			if(option.equals("y")) {
				toContinue = true;
			} else {
				toContinue = false;
				System.out.println("Bye!");
			}
			
		} while(toContinue == true);
	}
}
