package testes;

import metodos.Palindromos;

public class TestePalindromo {

	public static void main(String[] args) {
		String palavra = "babad";
		Palindromos p = new Palindromos();
		p.setPalavra(palavra);
		p.getMaiorPalin();
	}

}
