package br.com.samu.mvc.escola.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.samu.mvc.escola.model.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Long> {
	 
		long deleteByCPF(String CPF);
	    @Modifying
	    @Query("delete from Aluno A where A.CPF=:CPF")
	    void deleteAluno(@Param("CPF") String CPF);
}

