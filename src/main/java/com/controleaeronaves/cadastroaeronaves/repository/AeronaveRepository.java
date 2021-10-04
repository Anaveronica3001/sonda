package com.controleaeronaves.cadastroaeronaves.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controleaeronaves.cadastroaeronaves.model.Aeronave;

@Repository
public interface AeronaveRepository extends JpaRepository<Aeronave, Long>{
	public List<Aeronave> findAllByModeloContainingIgnoreCase(String modelo);
}
