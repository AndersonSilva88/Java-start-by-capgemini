package cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	Connection con; // conexao bando de dados
	PreparedStatement stmt; // acessa a tabela (insert, update, delete, select) 
	ResultSet rs; //consulta a tabela (select)
	CallableStatement call; //procedures e function
	
	public void open() throws Exception {
		String url = "jdbc:postgresql://localhost:5432/cadastros";
		String user = "postgres";
		String password = "1234";
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar com o banco");
		}
	}
	
	public void close() throws Exception {
		con.close();
	}
	
	
	
	
}
