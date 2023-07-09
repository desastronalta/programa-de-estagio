package metodos;

import java.util.ArrayList;

public class Maiusculas {
	private String frase;
	private StringBuffer fraseMod;
	ArrayList<Integer> indice = new ArrayList<Integer>();	
	
	public Maiusculas(String frase) {
		this.frase = frase;
		this.indice = new ArrayList<Integer>();
		this.fraseMod = new StringBuffer(frase);
	}
	 private void procuraPontos() {
		 String palavra = this.frase;
		 for(int i = 0; i < palavra.length(); i++) {
			 if(i == 0) {
				 indice.add(i);
			 }
			 if(i == palavra.length()-1) {
				 break;
			 }
			 char letra = palavra.charAt(i);
			 if(i != 0 && getIndice(letra, i) != 0 ) {
				 indice.add(getIndice(letra, i));
				 
			 }
		 }
	 }
	 
	 private int getIndice(char e, int i) {
		 int k = 0;
		 char[] ponto = new char[4];
		 ponto[0] = '.';
		 ponto[1] = ';';
		 ponto[2] = '?';
		 ponto[3] = '!';
		 	for(int j = 0; j < ponto.length; j++) {
		 		if(e == ponto[j]) {
		 			k = i+2;
		 		}
		 	}
		 	
		 return k;
	 }
	 private void addMaiuscula() {
		 for(int i = 0; i < this.indice.size();i++) {
			 Character c = this.fraseMod.charAt(this.indice.get(i));
			 c = Character.toUpperCase(c);
			 this.fraseMod.setCharAt(this.indice.get(i), c);
			 //alterar metodo para adicionar letra por letra.
		 }
	 }
	 public String mostraFraseMod() {
		 procuraPontos();
		 addMaiuscula();
		 String fraseUpper = this.fraseMod.toString();
		 return fraseUpper;
	 }
}
