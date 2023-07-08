package metodos;

import java.util.ArrayList;

public class maiusculas {
	private String frase;
	private StringBuffer letras = new StringBuffer();
	private StringBuffer fraseMod = new StringBuffer();
	ArrayList<Integer> indice = new ArrayList<Integer>();	
	
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	 private void procuraPontos() {
		 String palavra = this.frase;
		 for(int i = 0; i < palavra.length(); i++) {
			 if(i == 0) {
				 indice.add(i);
			 }
			 char letra = palavra.charAt(i);
			 if(i != 0) {
				 indice.add(getIndice(letra, i));
				 
			 }
		 }
	 }
	 private int getIndice(char e, int i) {
		 int k = 0;
		 	
		 return k;
	 }
}
