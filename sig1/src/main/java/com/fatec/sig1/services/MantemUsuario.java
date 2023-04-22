package com.fatec.sig1.services;

import java.util.List;
import java.util.Optional;

import com.fatec.sig1.model.Usuario.Usuario;

public interface MantemUsuario {
    List<Usuario> consultaTodos();

    Optional<Usuario> consultaPorNome(String nome);

    Optional<Usuario> consultaPorEmail(String email);

    Optional<Usuario> consultaPorId(Long id);

    Optional<Usuario> save(Usuario usuario);

    void delete(Long id);

    Optional<Usuario> atualiza(Long id, Usuario usuario);

}