package com.example.recordstesting.pessoa;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PessoaLombok {
    private final String nome;
    private final String cpf;
    private final LocalDate dataNascimento;
}
