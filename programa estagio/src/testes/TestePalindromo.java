package testes;

import metodos.Palindromos;

public class TestePalindromo {

	public static void main(String[] args) {
		// nao mostra todos palindromos.
		String palavra = "babad";
		Palindromos p = new Palindromos();
		p.setPalavra(palavra);
		p.getMaiorPalin();
	}

}
