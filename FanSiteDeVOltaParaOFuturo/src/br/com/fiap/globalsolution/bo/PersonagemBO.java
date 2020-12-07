package br.com.fiap.globalsolution.bo;

import java.sql.SQLException;

import br.com.fiap.globalsolution.bean.Personagem;
import br.com.fiap.globalsolution.dao.PersonagemDAO;

public class PersonagemBO {
	
	private PersonagemDAO personagemDAO = new PersonagemDAO();
	
	
	public Personagem getPersonagemById(int idPersonagem) {
		try {
			return personagemDAO.getPersonagemsById(idPersonagem);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
