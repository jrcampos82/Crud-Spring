package br.edu.ifms.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifms.crudspring.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
    // List<Professor> findByProfessorId(UUID professor_id);
    
}
