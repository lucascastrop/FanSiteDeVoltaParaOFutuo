package br.com.fiap.globalsolution.bean;


import java.sql.Date;

public class Personagem {

	private int idPersonagem;
    private String nome;
    private Date dataNascimento;
    private String miniBio;
    private String resumo1985;
    private String resumo1955;
    private String resumo1985A;
    private String curiosidade;

    
    public int getIdPersonagem() {
		return idPersonagem;
	}

	public void setIdPersonagem(int idPersonagem) {
		this.idPersonagem = idPersonagem;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMiniBio() {
        return miniBio;
    }

    public void setMiniBio(String miniBio) {
        this.miniBio = miniBio;
    }

    public String getResumo1985() {
        return resumo1985;
    }

    public void setResumo1985(String resumo1985) {
        this.resumo1985 = resumo1985;
    }

    public String getResumo1955() {
        return resumo1955;
    }

    public void setResumo1955(String resumo1955) {
        this.resumo1955 = resumo1955;
    }

    public String getResumo1985A() {
        return resumo1985A;
    }

    public void setResumo1985A(String resumo1985A) {
        this.resumo1985A = resumo1985A;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

}