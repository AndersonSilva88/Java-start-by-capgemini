package cadastros;

import java.util.List;

public class Menu {
	
	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		
		try {
			/*
			//incluir uma pessoa
			Pessoa p1 = new Pessoa(1, "anderson", "anderson@gmail");
			Pessoa p2 = new Pessoa(2, "joao", "joao@gmail.com");
			Pessoa p3 = new Pessoa(3, "jose", "jose@gmail");
			pd.incluirPessoa(p1);
			pd.incluirPessoa(p2);
			pd.incluirPessoa(p3);
			*/
			/*
			 * Pessoa pes = pd.consultarPessoaIndividual(1); if(pes != null) {
			 * pes.setEmail("anderson2@gmail.com"); pd.alterarPessoa(pes);
			 * 
			 * //listando todas as pessoas List<Pessoa> listaPessoas = pd.ListarPessoas();
			 * 
			 * for(Pessoa p: listaPessoas) { System.out.println("Id.: " + p.getIdPessoa());
			 * System.out.println("Nome : " +p.getNome()); System.out.println("Email : "
			 * +p.getEmail()); }
			 * 
			 * }
			 */
			/*
			
			//excluir uma pessoa
			Pessoa pessoa1 = pd.consultarPessoaIndividual(1);
			
			pd.excluirPessoa(pessoa1);
			
			List<Pessoa> listaPessoas = pd.ListarPessoas();
			
			for(Pessoa p: listaPessoas) {
				System.out.println("Id.: " + p.getIdPessoa());
				System.out.println("Nome : "  +p.getNome());
				System.out.println("Email : " +p.getEmail());
			}
			
			*/
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
				
	}

}
