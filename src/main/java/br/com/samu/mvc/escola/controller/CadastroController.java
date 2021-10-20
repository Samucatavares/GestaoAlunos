package br.com.samu.mvc.escola.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.samu.mvc.escola.dto.RequisicaoPedido;
import br.com.samu.mvc.escola.model.Aluno;
import br.com.samu.mvc.escola.repository.AlunoRepository;


@Controller
@RequestMapping("cadastro")
public class CadastroController {
		
	@Autowired	
	private AlunoRepository alunorepository;
		@GetMapping("form")
		public String cadastroform() {
			return 	"cadastro/form";		}
		@GetMapping("deleta")
		public String deleta() {
			return 	"cadastro/deleta";		}
		@GetMapping("edit")
		public String edit() {
			return 	"cadastro/edit";		}
		
		
		@PostMapping("novo")
		public String novo(RequisicaoPedido requisicao){
			
			Aluno aluno = requisicao.ToAluno();
			alunorepository.save(aluno);
			return "cadastro/form";			
		}
		
		
		@PostMapping("delete")
		@Transactional
		public String delete(RequisicaoPedido requisicao){
			alunorepository.deleteAluno(requisicao.getCPF());
			return "home";			
		}
		
		@PostMapping("editar")
		@Transactional
		public String Edit(RequisicaoPedido requisicao){
			alunorepository.deleteAluno(requisicao.getCPF());
			return "cadastro/update";	
}
		
		@GetMapping("update")
		public String cadastroupdate() {
			return 	"home";		}
		
		
}

