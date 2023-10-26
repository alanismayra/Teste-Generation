package com.projeto.blogpessoal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Alunos {
    /*
     * ID, nome, idade, nota do primeiro semestre, nota do segundo semestre, nome do
     * professor e número da sala
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String nome;
    @Column
    private double notaPrimeiroSemestre;
    @Column
    private double notaSegundoSemestre;
    @Column
    private String nomeProfessor;
    @Column
    private String numeroSala;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(double notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public double getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(double notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

}
