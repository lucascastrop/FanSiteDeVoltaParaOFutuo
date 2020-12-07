package br.com.fiap.globalsolution.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.globalsolution.bean.Curiosidade;
import br.com.fiap.globalsolution.factory.ConnectionFactory;


public class CuriosidadeDAO {

    //Atributo
    private Connection con;

	public CuriosidadeDAO() {
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

    //select
    public List<Curiosidade> getCuriosidades() throws SQLException, ParseException {
        
    	String sql = null;
    	
    	sql = "SELECT * FROM T_BTTF_CURIOSICADES_GERAIS";
    	
    	ArrayList<Curiosidade> curiosidades = null;
    	
    	curiosidades = new ArrayList<>();

		PreparedStatement ps = null;
		ResultSet rs = null;
    	 
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			Curiosidade curiosidade = null;

	        while (rs.next()) {
	            curiosidade = new Curiosidade();
	            curiosidade.setDescricao(rs.getString("ds_curiosidade"));
	            System.out.println( curiosidade.getDescricao());
	            curiosidades.add(curiosidade);
	        }
		}catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
		}
	
        return curiosidades;
		
    }

}