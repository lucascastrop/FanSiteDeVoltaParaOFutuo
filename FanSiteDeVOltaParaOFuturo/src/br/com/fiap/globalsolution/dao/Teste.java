package br.com.fiap.globalsolution.dao;

import java.sql.SQLException;
import java.text.ParseException;

import br.com.fiap.globalsolution.bean.Personagem;
import br.com.fiap.globalsolution.bo.PersonagemBO;


public class Teste {

	public static void main(String[] args) throws SQLException, ParseException {
		// TODO Auto-generated method stub
		
		CuriosidadeDAO curiosidadeDAO = new CuriosidadeDAO();
		curiosidadeDAO.getCuriosidades();
		
		PersonagemBO personagemBO = new PersonagemBO();
		Personagem personagem = new Personagem();
		personagem = personagemBO.getPersonagemById(1);
		System.out.println( personagem.getNome());
		System.out.println( personagem.getMiniBio());
		System.out.println( personagem.getResumo1955());
		System.out.println( personagem.getCuriosidade());
	}
	
}
