package metodos;
import java.util.ArrayList;

public class Reverse {
	//var's
	private String frase;
	private StringBuffer inverse;
	private ArrayList<String> palavras;
	
	public Reverse(){
		this.inverse = new StringBuffer();
		this.palavras = new ArrayList<String>();
	}
	//getters and setters
	public String getFrase() {
		return frase;
	}
	public StringBuffer getInverse() {
		return inverse;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	public void setInverse(StringBuffer inverse) {
		this.inverse = inverse;
	}
	//metodos de inversão
	private void findWords(){
		int lim = 0;
		for(int i = 0; i < this.frase.length(); i++) {
			char letra = this.frase.charAt(i);
			if(letra == ' ') {
				palavras.add(getWord(i-1,lim));
				if(lim == 0)
				lim = i+1;
			}
		}
	}
	
	public String inverteString(){
		String fraseInvertida = null; 
		findWords();
		for(int i = this.palavras.size()-1; i >= 0; i--) {
			this.inverse.append(this.palavras.get(i));
			this.inverse.append(' ');
		}
		fraseInvertida = this.inverse.toString();
		return fraseInvertida;
		
	}
	
	private String getWord(int i, int lim) {
		StringBuffer word = new StringBuffer();
		for(int j = lim ;j < i; j++) {
			word.append(this.frase.charAt(j));
		}
		String palavra = word.toString() ;
		return palavra;
	}
}
