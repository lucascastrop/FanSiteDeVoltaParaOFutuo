package br.com.fiap.globalsolution.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.globalsolution.bean.Curiosidade;
import br.com.fiap.globalsolution.bean.Personagem;
import br.com.fiap.globalsolution.bo.CuriosidadeBO;
import br.com.fiap.globalsolution.bo.PersonagemBO;


@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String acao = request.getParameter("acao");
		String retorno = "";
		
		switch (acao) {
		case "personagem55":
			getPersonagem(request, response);
			retorno="personagens55.jsp";
			break;
		case "personagem85Antes":
			getPersonagem(request, response);
			retorno="personagens85.jsp";
			break;
		case "personagem85Depois":
			getPersonagem(request, response);
			retorno="personagens85Pos.jsp";
			break;
		case "listarCuriosidadesGerais":
			try {
				listarCuriosidadesGerais(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			retorno="curiosidades.jsp";
			break;
		}
		request.getRequestDispatcher(retorno).forward(request, response);
	}
	
	// personagem 55 = timeline-- varia de acordo com o retorno da pag ---> id(personagem varia com id)
	//personagem 85Pos = id 2
	//personagem 85Antes = id 3
	
	private void getPersonagem (HttpServletRequest request, HttpServletResponse response) {
		 
		PersonagemBO personagemBO = new PersonagemBO();
		Personagem personagem = new Personagem();
		
		int idPersonagem = Integer.parseInt(request.getParameter("idPersonagem"));
		
		
		personagem = personagemBO.getPersonagemById(idPersonagem);
		
		String nome = personagem.getNome();
		//Date nascimento = personagem55.getDataNascimento();
		// pegar data
		String miniBio = personagem.getMiniBio();
		String resumo1955 = personagem.getResumo1955();
		String resumo1985Depois = personagem.getResumo1985();
		String resumo1985Antes = personagem.getResumo1985A();
		String curiosidades = personagem.getCuriosidade();

		request.setAttribute("Tnome", "Nome");
		request.setAttribute("nome", nome);
//		request.setAttribute("nascimento", nascimento);
		request.setAttribute("TminiBio", "Mini Bio");
		request.setAttribute("miniBio", miniBio);
		request.setAttribute("Tresumo1985Antes", "Pre Viagem no Tempo");
		request.setAttribute("resumo1985Antes", resumo1985Antes);
		request.setAttribute("Tresumo1985Depois", "Pos Viagem no Tempo");
		request.setAttribute("resumo1985Depois", resumo1985Depois);
		request.setAttribute("Tresumo1955", "Primeiraa Viagem no Tempo");
		request.setAttribute("resumo1955", resumo1955);
		request.setAttribute("Tcuriosidades", "Curiosidades");
		request.setAttribute("curiosidades", curiosidades);
			
		
	}
	
	private void listarCuriosidadesGerais (HttpServletRequest request, HttpServletResponse response) throws SQLException, ParseException {

			CuriosidadeBO curiosidadeBO = new CuriosidadeBO();
			List<Curiosidade> listaCuriosidades = curiosidadeBO.listarCuriosidades();
			if(listaCuriosidades != null) {
				request.setAttribute("listaCuriosidades", listaCuriosidades);


			
			}			
			
	}
}
