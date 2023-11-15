package br.unisales.FabSoft.controller;

import br.unisales.fabsoft.model.Proponente;
import br.unisales.fabsoft.model.ProponenteRepository;
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
@RequestMapping("/Proponente")
public class ProponenteController {

    @Autowired
    ProponenteRepository repository;

    @GetMapping({"", "/"})
    public List<Proponente> getProponente() {
        return repository.findAll(Sort.by("id"));
    }

    @PostMapping({"", "/"})
    public Proponente insere(@RequestBody Proponente proponente) {
        return repository.save(proponente);
    }

    @PutMapping({"", "/"})
    public Proponente atualiza(@RequestBody Proponente proponente) {
        if (proponente.getId() != null) {
            return repository.save(proponente);
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

