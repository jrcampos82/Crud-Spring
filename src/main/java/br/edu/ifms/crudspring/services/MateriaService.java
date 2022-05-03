package br.edu.ifms.crudspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.crudspring.model.Materia;
import br.edu.ifms.crudspring.repository.MateriaRepository;

@Service
public class MateriaService {

    @Autowired
    MateriaRepository materiaRepository;

    public List<Materia> getAll(){
        return materiaRepository.findAll();
    }
    
}
