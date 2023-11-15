package br.unisales.FabSoft.controller;

import br.unisales.fabsoft.model.Estudantes;
import br.unisales.fabsoft.model.EstudantesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Estudantes")
public class EstudantesController {

    @Autowired
    EstudantesRepository repository;

    @GetMapping({"", "/"})
    public List<Estudantes> getEstudantes() {
        return repository.findAll(Sort.by("id"));
    }

    @PostMapping({"", "/"})
    public Estudantes insere(@RequestBody Estudantes estudantes) {
        return repository.save(estudantes);
    }

    @PutMapping({"", "/"})
    public Estudantes atualiza(@RequestBody Estudantes estudantes) {
        if (estudantes.getId() != null) {
            return repository.save(estudantes);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String exclui(@PathVariable("id") Long id) {
        if (id != null) {
            repository.deleteById(id);
            return "Excluído";
        }
        return null;
    }
}

