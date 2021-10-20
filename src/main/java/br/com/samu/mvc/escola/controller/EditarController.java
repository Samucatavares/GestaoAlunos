package br.com.samu.mvc.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.samu.mvc.escola.dto.RequisicaoPedido;
import br.com.samu.mvc.escola.model.Aluno;
import br.com.samu.mvc.escola.repository.AlunoRepository;




@Controller
@RequestMapping("editar")
public class EditarController {
	
			
		@Autowired	
		private AlunoRepository alunorepository;
			@GetMapping("form")
			public String cadastroform() {
				return 	"editar/form";		}
			
			
			@PostMapping("novo")
			public String novo(RequisicaoPedido requisicao){
				
				Aluno aluno = requisicao.ToAluno();
				alunorepository.save(aluno);
				return "editar/form";			
			}
	}

