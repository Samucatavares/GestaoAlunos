package br.com.samu.mvc.escola.dto;
import java.time.LocalDate;

import br.com.samu.mvc.escola.model.Aluno;

public class RequisicaoPedido {
	private String nomeAluno;
	private LocalDate DataNascimento;
	private String urlImagem;
	private String CPF;
	private String NumMatricula;
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public LocalDate getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getNumMatricula() {
		return NumMatricula;
	}
	public void setNumMatricula(String numMatricula) {
		NumMatricula = numMatricula;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	public Aluno ToAluno() {
		
	Aluno aluno = new Aluno();
	aluno.setCPF(CPF);
	aluno.setDataNascimento(DataNascimento);
	aluno.setFoto(urlImagem);
	aluno.setNumMatricula(NumMatricula);
	aluno.setNomeAluno(nomeAluno);
	return aluno;
	
	}
}
	