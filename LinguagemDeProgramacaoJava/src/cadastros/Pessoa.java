package cadastros;

public class Pessoa {
	
	private int idPessoa;
	private String nome;
	private String email;
	
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Pessoa(int idPessoa, String nome, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
