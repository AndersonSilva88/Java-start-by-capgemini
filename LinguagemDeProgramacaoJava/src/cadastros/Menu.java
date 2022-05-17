package cadastros;

import java.util.List;

public class Menu {
	
	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();

		try {
			// Incluir uma pessoa
			/*
			 * Pessoa p1 = new Pessoa(1,"jose", "jose@gmail.com"); Pessoa p2 = new
			 * Pessoa(2,"joao", "joao@gmail.com"); pd.incluirPessoa(p1);
			 * pd.incluirPessoa(p2);
			 * 
			 */
			// Alterar uma pessoa
			// - Alterar a informacao desejada usando o set(Classe encapsulada)
			try {
				Pessoa pes = pd.consultarPessoaIndividual(2);

				// se o resultado da consulta a pessoa retornar null � porque nao encontrou
				// a pessoa
				if (pes != null) {
					pes.setEmail("joao2@gmail.com");
					// chamar o metodo de cont�m o comando update
					pd.alterarPessoa(pes);
				} else {
					System.out.println("Pessoa nao encontrada ou falha no acesso ao banco de dados");
				}

				// Listando todas as pessoas
				List<Pessoa> listaPessoas = pd.ListarPessoas();
				for (Pessoa p : listaPessoas) {
					System.out.println("Id.: " + p.getIdPessoa());
					System.out.println("Nome : " + p.getNome());
					System.out.println("Email : " + p.getEmail());
				}
			} catch (Exception ex) {
				System.out.println("Alguma coisa deu errado no acesso ao banco de dados.");
			}
			/*
			 * // Excluir uma pessoa // verificar se a pessoa existe por codigo Pessoa
			 * pessoa1 = pd.consultarPessoaIndividual(1); // chamar o m�todo que contem o
			 * comando delete pd.excluirPessoa(pessoa1); // Listando todas as pessoas
			 * List<Pessoa> listaPessoas = pd.ListarPessoas(); for(Pessoa p : listaPessoas){
			 * System.out.println("Id.: " + p.getIdPessoa()); System.out.println("Nome : "
			 * +p.getNome()); System.out.println("Email : " +p.getEmail()); }
			 */

		} catch (Exception e) {
			System.out.println("Error:  " + e.getMessage());
		}

	}

}
