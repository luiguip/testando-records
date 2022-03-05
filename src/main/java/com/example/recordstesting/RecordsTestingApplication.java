package com.example.recordstesting;

import com.example.recordstesting.pessoa.Pessoa;
import com.example.recordstesting.pessoa.PessoaLombok;
import com.example.recordstesting.pessoa.PessoaRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class RecordsTestingApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(RecordsTestingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RecordsTestingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var nome = "Luis Almeida";
        var cpf = "19247519528";
        LocalDate dataNascimento = LocalDate.parse("2009-12-02");
        var pessoa = new Pessoa(nome, cpf, dataNascimento);
        var pessoaLombok = new PessoaLombok(nome, cpf, dataNascimento);
        var pessoaRecord = new PessoaRecord(nome, cpf, dataNascimento);
        log.info("Pessoa: " + pessoa);
        log.info("Pessoa Lombok: " + pessoaLombok);
        log.info("Pessoa Record: " + pessoaRecord);
    }
}
