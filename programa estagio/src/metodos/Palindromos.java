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
		String inverso;
		String palavra = this.palavra;
		String subStr;
		for(int i = 0; i < this.palavra.length(); i++) {
			for(int j = i; j < this.palavra.length(); j++) {
				if(j > i) {
					subStr = palavra.substring(i, j);
					inverso = new StringBuilder(subStr).reverse().toString();
					if(subStr.equals(inverso)){
						this.palindromos.add(subStr);
					}
				}
			}
		}
	}
	public void getMaiorPalin() {
		ArrayList<String> maiorPalin = new ArrayList<String>();
		int maior = 0;
		for(int i = 0; i < this.palindromos.size()-1; i++) {
			int tam = this.palindromos.get(i).length();
			if(tam > maior){
				maior = tam;
			}
		}
		for(int i = 0; i < this.palindromos.size()-1; i++) {
			String palavra = this.palindromos.get(i);
			if(palavra.length() == maior) {
				maiorPalin.add(palavra);
			}
		}
		mostraPalindromo(maiorPalin);
	}
	private void mostraPalindromo(ArrayList<String> lista) {
		for(int i = 0; i < lista.size()-1; i++) {
			System.out.println(lista.get(i));
		}
	}
}
