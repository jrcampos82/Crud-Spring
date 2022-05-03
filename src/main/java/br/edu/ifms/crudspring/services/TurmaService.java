package br.edu.ifms.crudspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Turma;
import br.edu.ifms.crudspring.repository.TurmaRepository;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public List<Turma> getTurmas(){
        return turmaRepository.findAll();
    }

    public void salvar(Turma t){
        turmaRepository.save(t);
    }
    
}
