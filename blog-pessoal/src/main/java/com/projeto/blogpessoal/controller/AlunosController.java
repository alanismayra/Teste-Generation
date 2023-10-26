package com.projeto.blogpessoal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.projeto.blogpessoal.model.Alunos;
import com.projeto.blogpessoal.repository.AlunosRepository;

@RestController
@RequestMapping("/api")
public class AlunosController {

    @Autowired
    private AlunosRepository alunosRepository;

    @PostMapping
    public Alunos save(@RequestBody Alunos aluno) {
        return alunosRepository.save(aluno);
    }

    @GetMapping
    public List<Alunos> findAll() {
        return alunosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Alunos> findById(@PathVariable Integer id) {
        return alunosRepository.findById(id);
    }

    @PutMapping
    public Alunos put(@RequestBody Alunos aluno) {
        return alunosRepository.findById(aluno.getId()).map(alunoEncontrado -> {
            alunoEncontrado = aluno;
            return alunosRepository.save(alunoEncontrado);
        }).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        alunosRepository.findById(id).map(alunoEncontrado -> {
            Alunos aluno = alunoEncontrado;
            alunosRepository.delete(alunoEncontrado);
            return aluno;
        }).orElseThrow();
    }
}
