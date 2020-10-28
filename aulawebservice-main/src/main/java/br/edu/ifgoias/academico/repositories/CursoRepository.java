package br.edu.ifgoias.academico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifgoias.academico.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
