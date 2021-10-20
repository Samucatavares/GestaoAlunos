package br.com.samu.mvc.escola.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Aluno {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String nomeAluno;
	private String NumMatricula;
	private String CPF; 
	private String Foto;
	private LocalDate DataNascimento;

	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
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
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		this.Foto = foto;
	}
	public LocalDate getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}



}
