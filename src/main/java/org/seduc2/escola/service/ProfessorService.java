package org.seduc2.escola.service;

import org.seduc2.escola.entity.Professor;
import org.seduc2.escola.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> buscarTodos(){
        return repository.findAll();
    }

    public void criarProfessor(Professor p){
        Professor professor = new Professor(p.getNome(), p.getCpf(), p.getIdade());
        repository.save(professor);
    }
}
