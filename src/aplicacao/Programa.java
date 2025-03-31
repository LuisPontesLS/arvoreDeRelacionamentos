package aplicacao;

import java.util.Locale;

import pessoa.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Pessoa pessoa1 = new Pessoa("Landro", "Itaquá", true, 'M'); // CRIA OBJETO PESSOA1
		System.out.println(pessoa1);

		pessoa1.setNome("Camila");// MODIFICANDO APENAS O NOME
		pessoa1.nota(1);
		System.out.println("\nApós modificar nome: \n" + pessoa1);

	}//

}
