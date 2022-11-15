package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Linea;


@Repository
public interface LineaRepository extends JpaRepository<Linea, String>{

}
