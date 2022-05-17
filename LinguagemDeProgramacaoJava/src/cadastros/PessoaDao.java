package cadastros;

import java.util.ArrayList;
import java.util.List;

public class PessoaDao extends Dao {
	
	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values (?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
		
	}
	
	public void alterarPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("update Pessoa nome = ?, email = ? where idPessoa = ?");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public void excluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("delete from Pessoa where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
		open();
		stmt = con.prepareStatement("select * from pessoa where idPessoa = ? ");
		rs = stmt.executeQuery();
		Pessoa p = null;
		if(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNome(rs.getString("nome"));
			p.setEmail(rs.getString("email"));
		}
		close();
		return p;
	}
	
	public List<Pessoa> ListarPessoas() {
		try {
			open();
			stmt = con.prepareStatement("select * from pessoa");
			rs = stmt.executeQuery();
			List<Pessoa> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoa p = new Pessoa();
				p.setIdPessoa(rs.getInt("idPessoa"));
				p.setNome(rs.getString("nome"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
