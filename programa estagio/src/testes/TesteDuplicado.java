package testes;

import metodos.Duplicados;

public class TesteDuplicado {
	public static void main(String[]args) {
		//caso a letra seja maiuscula aparece.
		Duplicados dupli = new Duplicados();
		String frase = "Hello, World!";
		dupli.setFrase(frase);
		System.out.println(dupli.mostrarSemDupli());
	}
}
