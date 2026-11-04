package org.seduc2.escola.controller;

import org.seduc2.escola.entity.Sala;
import org.seduc2.escola.service.SalaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sala")
public class SalaController {

    private final SalaService service;

    public SalaController(SalaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sala> mostrarSala(){
        return service.buscarTodos();
    }

    @PostMapping
    public void criarSala(@RequestBody Sala a){
        service.criarSala(a);
    }
}
