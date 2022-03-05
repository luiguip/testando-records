package com.example.recordstesting.pessoa;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa {
    private final String nome;
    private final String cpf;
    private final LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;
        return Objects.equals(nome, pessoa.nome)
                && Objects.equals(cpf, pessoa.cpf) 
                && Objects.equals(dataNascimento, pessoa.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, dataNascimento);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}