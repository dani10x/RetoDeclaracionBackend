package com.Daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Companias_soat;


@Repository
public interface Compania_soatRepository extends JpaRepository<Companias_soat, String>{

}
