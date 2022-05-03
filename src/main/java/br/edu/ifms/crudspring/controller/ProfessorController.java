package br.edu.ifms.crudspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.crudspring.model.Professor;
import br.edu.ifms.crudspring.model.Turma;
import br.edu.ifms.crudspring.services.ProfessorService;
import br.edu.ifms.crudspring.services.TurmaService;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @Autowired
    TurmaService turmaService;

    @GetMapping("/")
    public String listProfessores(Model model){
        
        List<Professor> professores = new ArrayList<Professor>();
        professores = professorService.listProfessores();
        
        model.addAttribute("professores", professores);

        return "list-professor";

    }

    @GetMapping("/novo")
    public String novoProfessor(Model model) {
        model.addAttribute("professor", new Professor());
        List<Turma> turmas = new ArrayList<Turma>();
        turmas = turmaService.getTurmas();
        model.addAttribute("turmas", turmas);
        return "cadastrar-professor";
    }

    @PostMapping("/save")
    public String novoProfessor(@ModelAttribute Professor p){
        professorService.salvar(p);
        return "redirect:/professor/";
    }
    
}
