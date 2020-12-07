package br.com.fiap.globalsolution.bo;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import br.com.fiap.globalsolution.bean.Curiosidade;
import br.com.fiap.globalsolution.dao.CuriosidadeDAO;

public class CuriosidadeBO {
	
	CuriosidadeDAO curiosidadeDAO = new CuriosidadeDAO();
	
	public List<Curiosidade> listarCuriosidades() throws SQLException, ParseException{
		
		return curiosidadeDAO.getCuriosidades();	
	
	}

}
