package Veiculos;

public class TesteDrive {

	public static void main(String[] args) {
		Carro c = new Civic();
		c.acelerar();
		System.out.println("Civic: "+c.getVelocidadeAtual());
		
		c = new Porsche();
		c.acelerar();
		System.out.println("Porsche: "+c.getVelocidadeAtual());
	}
}
