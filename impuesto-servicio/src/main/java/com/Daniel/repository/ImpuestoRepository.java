package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Impuesto;


@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Double>{
	
}
