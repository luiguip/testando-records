package com.example.recordstesting.pessoa;

import java.time.LocalDate;

public record PessoaRecord(String nome, String cpf, LocalDate dataNascimento) {
}
