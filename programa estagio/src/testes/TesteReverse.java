package testes;

import metodos.Reverse;

public class TesteReverse {

	public static void main(String[] args) {
		Reverse rev = new Reverse();
		String caso = "Hello world, i'm live!";
		rev.setFrase(caso);
		caso = rev.inverteString();
		System.out.println(caso);
	}

}
