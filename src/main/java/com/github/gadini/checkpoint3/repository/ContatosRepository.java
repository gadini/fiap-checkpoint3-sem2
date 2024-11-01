package com.github.gadini.checkpoint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.gadini.checkpoint3.model.Contatos;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long>{
    <T> T findByNome(String nome);
}
