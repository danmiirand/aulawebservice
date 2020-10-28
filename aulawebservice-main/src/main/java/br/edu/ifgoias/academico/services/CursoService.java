package br.edu.ifgoias.academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.edu.ifgoias.academico.entities.Curso;
import br.edu.ifgoias.academico.repositories.CursoRepository;

@Service
public class CursoService {

		@Autowired
		private CursoRepository repository;
		
		public List<Curso> findAll(){
				return repository.findAll();
		}
		
		public Curso findById(Integer id) {
			return repository.findById(id).orElseThrow(
						() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		}
		
		public Curso insert(Curso obj) {
			
			return repository.save(obj);
		}
		
		public void delete (Integer id) {
			repository.findById(id).map(
					curso -> {repository.delete(curso);
					returno Void.TYPE;
					})
		}
		
}
