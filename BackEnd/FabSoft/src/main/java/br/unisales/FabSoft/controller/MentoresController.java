package br.unisales.FabSoft.controller;

import br.unisales.fabsoft.model.Mentores;
import br.unisales.fabsoft.model.MentoresRepository;
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
@RequestMapping("/Mentores")
public class MentoresController {

    @Autowired
    MentoresRepository repository;

    @GetMapping({"", "/"})
    public List<Mentores> getMentores() {
        return repository.findAll(Sort.by("id"));
    }

    @PostMapping({"", "/"})
    public Mentores insere(@RequestBody Mentores mentores) {
        return repository.save(mentores);
    }

    @PutMapping({"", "/"})
    public Mentores atualiza(@RequestBody Mentores mentores) {
        if (mentores.getId() != null) {
            return repository.save(mentores);
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

