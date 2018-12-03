package catolica.org.Iniciando;

import java.util.Scanner;

public class PedirDados {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//solicita nome do usuário
		System.out.println("Enter your name: ");
		String name = in.nextLine();
		
		//solicita idade...
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		
		//solicita cidade natal...
		System.out.println("Enter your hometown: ");
		String hometown = in.next();
		
		
		System.out.println("Hello. My names is "+name);
		System.out.println("I have "+age+" years old");
		System.out.println("I'm natural "+hometown);
	}

}
