package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Traccion;


@Repository
public interface TraccionRepository extends JpaRepository<Traccion, String>{

}
