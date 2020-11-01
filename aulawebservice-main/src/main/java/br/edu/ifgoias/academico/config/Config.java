package br.edu.ifgoias.academico.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.academico.entities.Aluno;
import br.edu.ifgoias.academico.repositories.AlunoRepository;

@Configuration
public class Config implements CommandLineRunner {
    
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Aluno a1 = new Aluno(null, "Daniel", null, null);
		Aluno a2 = new Aluno(null, "Felipe", null, null);
	   
	    alunoRepository.save(a1);
	    alunoRepository.save(a1);

}
}