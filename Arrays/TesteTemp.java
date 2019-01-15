package Arrays;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TesteTemp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TempDia dias = new TempDia();
		DecimalFormat df = new DecimalFormat("0.0");// formula para alterar casas decimais
		int countArray;
		double total = 0;
		int countCalc;
		int sizeArray = 0;
		
		sizeArray = dias.temperature.length;
		
		System.out.println("Array size: " + sizeArray);
		System.out.println();
		
		sizeArray--;
		
		for(countArray=0; countArray<=sizeArray; countArray++) {
			System.out.printf("Enter a temperature: ");
			dias.temperature[countArray] = in.nextDouble();
		}
	
		System.out.println();
		
		//Printa o valor dentro da array(temperatura)
		for(int countPrint=0; countPrint<=sizeArray; countPrint++) {
			System.out.println("Temperature values: " + dias.temperature[countPrint]);
		}
		
		System.out.println();
		
		//Calculo temperatura média
		for(countCalc=0; countCalc<=sizeArray; countCalc++) {
			double tempValue = dias.temperature[countCalc];
			total = total + tempValue;
		}
		
		//Exibe os valores
		System.out.println("Total temperature(Temperatura total): " + (df.format(total)));
		total = (total/countCalc);
		System.out.println("Average temperature(Temperatura média): " + (df.format(total)));
	}

}
 