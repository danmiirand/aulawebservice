package br.com.academico.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.academico.entities.Curso;
import br.com.academico.repositories.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	public Curso findById(Integer id) {
		return cursoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	public Curso insert(Curso curso) {
		return cursoRepository.save(curso);
	}

	public void delete(Integer id) {
		cursoRepository.findById(id).map(curso -> {
			cursoRepository.delete(curso);
			return Void.TYPE;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	public void update(Integer id, Curso obj) {
		cursoRepository.findById(id).map(curso -> {
			curso.setNome(obj.getNome());
			return cursoRepository.save(curso);
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

}