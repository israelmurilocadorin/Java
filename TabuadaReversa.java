package catolica.org.Iniciando;

import java.util.Scanner;

public class TabuadaReversa {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type the table you want: ");
		int tabuada = in.nextInt();
		
		for(int counter=10;counter>=0;counter--) {
			System.out.println(tabuada+" x "+counter+" = "+(tabuada*counter));
		}
	}
}
