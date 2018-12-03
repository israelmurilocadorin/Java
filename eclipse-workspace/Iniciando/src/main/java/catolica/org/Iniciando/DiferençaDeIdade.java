package catolica.org.Iniciando;

import java.util.Scanner;

public class DiferençaDeIdade {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//solicita idade do usuário
		System.out.println("Enter your age: ");
		int ageUser = in.nextInt();
		
		//...idade da mãe
		System.out.println("Enter your mother's age: ");
		int ageMother = in.nextInt();
		
		//calcula a diferença de idade
		int difference = ageMother - ageUser;
		
		System.out.println("The age difference between you and your mother is "+difference+".");
	}
}
