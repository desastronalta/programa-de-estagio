package testes;

import metodos.Duplicados;

public class TesteDuplicado {
	public static void main(String[]args) {
		Duplicados dupli = new Duplicados();
		String frase = "hello, world!";
		dupli.setFrase(frase);
		dupli.addLetra();
	}
}
