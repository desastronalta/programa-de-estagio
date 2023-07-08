package testes;

import metodos.Maiusculas;

public class TesteMaiusculas {
	public static void main(String[]args){
		String frase = "hello. how are you? i'm fine! thanks; friend.";
		Maiusculas maiu = new Maiusculas(frase);
		System.out.println(maiu.mostraFraseMod());
		
		
	}
}
