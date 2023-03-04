package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Livros livro = new Livros();
		
		Gato gato = new Gato();
		gato.setNome("Atim");
		gato.setCor("Laranja");
		gato.setIdade(1);
		
		System.out.println(gato+"\n"+livro);

	}

}

class Livros {
	private String nome;
	private String npag;
}
