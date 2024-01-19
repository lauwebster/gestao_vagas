package br.com.laurawebster.gestao_vagas.modules.candidate.controllers;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //significa que essa classe é um controller, recebe a req. e retorna através dela
//REST - por ser uma API Rest
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired //instancia classe/interface
    private CandidateRepository candidateRepository;

    @PostMapping("/")
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity){
        return this.candidateRepository.save(candidateEntity);
    }
}
