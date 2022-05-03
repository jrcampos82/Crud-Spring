package br.edu.ifms.crudspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifms.crudspring.model.Turma;
import br.edu.ifms.crudspring.services.TurmaService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/turma")
@Slf4j
public class TurmaController {

    @Autowired
    TurmaService turmaService;

    @GetMapping("/")
    public String listTurma(Model model){
        log.info("listando turma...");
        List<Turma> turmas = turmaService.getTurmas();
        model.addAttribute("turmas", turmas);
        return "list-turma";

    }

    @GetMapping("/novo")
    public String novaTurma(Model model) {
        model.addAttribute("turma", new Turma());
        return "cadastrar-turma";
    }

    @PostMapping("/save")
    public String salvarTurma(@ModelAttribute("turma") Turma turma){
        turmaService.salvar(turma);
        return "redirect:/turma/";
    }
    
    
}
