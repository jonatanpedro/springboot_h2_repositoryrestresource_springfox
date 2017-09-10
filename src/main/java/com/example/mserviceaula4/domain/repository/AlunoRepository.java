package com.example.mserviceaula4.domain.repository;

import com.example.mserviceaula4.domain.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/alunos", collectionResourceRel = "alunos")
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
