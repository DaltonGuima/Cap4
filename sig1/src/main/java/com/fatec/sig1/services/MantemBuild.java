package com.fatec.sig1.services;

import java.util.List;
import java.util.Optional;

import com.fatec.sig1.model.Build;

public interface MantemBuild {
    List<Build> consultaTodos();

    Optional<Build> consultaPorNome(String nome);

    Optional<Build> save(Build build);

    void delete(Long id);

    Optional<Build> atualiza(Long id, Build build);

}