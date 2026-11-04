package org.seduc2.escola.controller;

import org.seduc2.escola.entity.Professor;
import org.seduc2.escola.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Professor> buscarTodos(){
        return service.buscarTodos();
    }

    @PostMapping
    public void criarProfessor(@RequestBody Professor s){
        service.criarProfessor(s);
    }
}
