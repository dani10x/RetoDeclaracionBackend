package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Marca;


@Repository
public interface MarcaRepository extends JpaRepository<Marca, String>{

}
