package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Caja;

@Repository
public interface CajaRepository extends JpaRepository<Caja, String>{

}
