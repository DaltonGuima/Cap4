package com.fatec.sig1.model.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.sig1.model.Build;

public interface MantemBuildRepository extends JpaRepository<Build, Long> {

}