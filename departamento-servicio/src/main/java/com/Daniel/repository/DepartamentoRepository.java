package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Departamento;


@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, String>{

}
