package br.edu.ifms.crudspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Professor;
import br.edu.ifms.crudspring.repository.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    

    public void salvar(Professor p){
        professorRepository.save(p);
    }
    

    public List<Professor> listProfessores(){
        return professorRepository.findAll();
    }

}
