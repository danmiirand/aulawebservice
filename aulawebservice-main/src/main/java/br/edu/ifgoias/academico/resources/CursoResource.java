package br.edu.ifgoias.academico.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifgoias.academico.entities.Curso;
import br.edu.ifgoias.academico.services.CursoService;

@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
	
	@Autowired
	private CursoService service;

	@GetMapping
	public ResponseEntity<List<Curso>> findAll(){
		List<Curso> cursos = service.findAll();
		return ResponseEntity.ok().body(cursos);		
	}
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<Curso> findById(@PathVariable Integer id){
		Curso curso = service.findById(id);
		return ResponseEntity.ok().body(curso);		
	}
	
}
