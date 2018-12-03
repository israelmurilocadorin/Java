package catolica.org.Iniciando;

import java.util.Scanner;

public class LoginSenha {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//solicita login
		System.out.println(">login: ");
		String login = in.nextLine();
		
		//solicita senha
		System.out.println(">password: ");
		String pass = in.nextLine();
		
		//comparação da instância(objeto) com uma String
		System.out.println(login.equals("israel") && pass.equals("java") ? ("User "+login+" successfully login.") : "Failed!. Login or password invalid.");
	}
}
		
	

