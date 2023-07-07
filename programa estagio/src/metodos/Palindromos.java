package metodos;

import java.util.ArrayList;

public class Palindromos {
	
	private String palavra;
	private ArrayList<String> palindromos;
	
	public Palindromos() {
		palindromos = new ArrayList<String>();
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public ArrayList<String> getPalindromos() {
		return palindromos;
	}
	
	private void lerSubStr() {
		String inverso = new StringBuilder(this.palavra).reverse().toString();
		String palavra = this.palavra;
		String subStr1, subStr2;
		for(int i = 0; i < this.palavra.length(); i++) {
			for(int j = i; j < this.palavra.length(); j++) {
				if(j > 0) {
					subStr1 = palavra.substring(i, j);
				}
				
			}
		}
	}
	
}
