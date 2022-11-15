package com.Daniel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Daniel.entity.Avaluo;


@Repository
public interface AvaluoRepository extends JpaRepository<Avaluo, String>{
	
	@Query(value="SELECT * FROM tabla_avaluos WHERE clase_id_clase=:clase and modelo=:modelo and cilindraje=:cc and linea_id_linea=:linea", nativeQuery=true)
	List<Avaluo> findAvaluo(String clase, int modelo, int cc, String linea);
}
