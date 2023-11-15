package br.unisales.fabsoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Mentores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cursoInteresse;
    private String email;
    private String emailProfissional;
    private String endereco;
    private String escolaridade;
    private String experienciaProfissional;
    private String facebook;
    private String instagram;
    private String linkedin;
    private String formacaoAcademica;
    private String lattes;
    private String nomeCompleto;
    private String site;
    private String telefone;
}
