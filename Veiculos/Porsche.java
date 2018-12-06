package Veiculos;

public class Porsche extends Carro {
	
	public Porsche() {
		VELOCIDADE_MAXIMA = 350;
	}

	public void acelerar() {
		super.acelerarMais(20);
	}
	
}
