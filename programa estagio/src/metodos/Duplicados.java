package metodos;

//import java.util.ArrayList;

public class Duplicados {
	private StringBuffer semDuplicadas;
	private String frase;
	//private ArrayList<String> palavras;
	
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public Duplicados() {
		//palavras = new ArrayList<String>();
		semDuplicadas = new StringBuffer();
	}
	
	public void addLetra() {
		String palavra = this.frase;
		for(int i = 0; i < palavra.length(); i++ ) {
			char letra = palavra.charAt(i);
			if(i == 0) {
				this.semDuplicadas.append(letra);
			}else if(verificaDupli(letra)) {
				this.semDuplicadas.append(letra);
			}
		}
	System.out.println(this.semDuplicadas);
	}
	private boolean verificaDupli(char letra) {
		String palavra = this.semDuplicadas.toString();
		boolean teste = true;
		int count = 0;
		for(int i = 0; i< palavra.length(); i++) {
			if(letra == palavra.charAt(i)) {
				count ++;
			}
		}
		if(count > 0 ) {
			teste = false;
		}
		return teste;
	}
	
}
