package br.com.fiap.globalsolution.dao;

import br.com.fiap.globalsolution.bean.Personagem;
import br.com.fiap.globalsolution.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonagemDAO {

    //Atributo
    private Connection con;

	public PersonagemDAO() {
		ConnectionFactory cf = null;
		cf = new ConnectionFactory();
		try {
			this.con = cf.DBConnectionManager();	
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

    //getById
    public Personagem getPersonagemsById(int idPersonagem) throws SQLException {
    	
    	
    	Personagem personagem = null;
        personagem = new Personagem();

        PreparedStatement st = null;
        
        st = con.prepareStatement("SELECT * FROM T_BTTF_PERSONAGENS WHERE cd_id=?");
        st.setInt(1, idPersonagem);

        st.execute();

        //Retorno dos dados
        ResultSet rs = null;
        rs = st.getResultSet();

        while (rs.next()) {
	        personagem.setNome(rs.getString("nm_nome"));
	        personagem.setDataNascimento(rs.getDate("dt_nascimento"));
	        personagem.setMiniBio(rs.getString("ds_minibio"));
	        personagem.setResumo1955(rs.getString("ds_resumo1955"));
	        personagem.setResumo1985(rs.getString("ds_res1985_pos_viagem"));
	        personagem.setResumo1985A(rs.getString("ds_resumo1985"));
	        personagem.setCuriosidade(rs.getString("ds_curiosidadepersonagem"));
	    }
      
        return personagem;
    }
}
