package metodos;

public class Anagrama {
	private String frase;
	private String reverse;
	public Anagrama(String frase) {
		StringBuffer inverte = new StringBuffer(frase);
		this.frase = frase;
		this.reverse = inverte.reverse().toString();
	}
	
	public String comparaAnagram() {
		String resposta = "false";
		if(this.frase.equalsIgnoreCase(this.reverse)) {
			resposta = "true";
		}
		return resposta;
	}
}
