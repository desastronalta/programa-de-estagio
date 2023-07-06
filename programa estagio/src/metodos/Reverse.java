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
		String palavra = null;
		int lim = 0;
		for(int i = 0; i < this.frase.length(); i++) {
			char letra = this.frase.charAt(i);
			if(letra == ' ') {
				palavras.add(getWord(i,lim));
				lim = i;
			}
		}
	}
	
	public void inverteString(){
		
	}
	
	private String getWord(int i, int lim) {
		StringBuffer word = new StringBuffer();
		for(int j = lim ;j < i; j++) {
			
		}
		String palavra = word.toString() ;
		return palavra;
	}
}
