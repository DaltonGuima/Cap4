package com.fatec.sig1.model.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

import com.fatec.sig1.model.Build;

public interface MantemBuildRepository extends JpaRepository<Build, Long> {

    List<Build> findAllByNomeIgnoreCaseContaining(String nome);

}