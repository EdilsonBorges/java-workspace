package OO.heranca;

public class Ferrari extends Carro {

	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}

	public void acelerar() {
		super.acelerarMais(20); // m�todo super deixa claro o acesso � classe
								// pai
	}
}
