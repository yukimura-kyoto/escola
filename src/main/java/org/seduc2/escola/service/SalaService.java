package org.seduc2.escola.service;

import org.seduc2.escola.entity.Sala;
import org.seduc2.escola.repository.SalaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public List<Sala> buscarTodos(){
        return repository.findAll();
    }

    public void criarSala(Sala s){
        Sala sala = new Sala(s.getNome(), s.getCadeiras(), s.getMesas(), s.getAlunos());
        repository.save(sala);
    }
}