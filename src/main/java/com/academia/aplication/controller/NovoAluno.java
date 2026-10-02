package com.academia.aplication.controller;
import com.academia.aplication.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Cadastro")
public class NovoAluno {


    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno){

        Aluno novoAluno = new Aluno();
        novoAluno.setNome(aluno.getNome());
        novoAluno.setSobrenome(aluno.getSobrenome());
        novoAluno.setAltura(aluno.getAltura());
        novoAluno.setIdade(aluno.getIdade());
        novoAluno.setPeso(aluno.getPeso());
        novoAluno.setSexo(aluno.getSexo());
        
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAluno);
    }
}
