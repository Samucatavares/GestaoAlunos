package br.com.samu.mvc.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.samu.mvc.escola.model.Aluno;
import br.com.samu.mvc.escola.repository.AlunoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/home")
	public String home(Model model) {
		List<Aluno> alunos = (List<Aluno>) repository.findAll();
		model.addAttribute("alunos", alunos);
		return "home"; 
	}
}