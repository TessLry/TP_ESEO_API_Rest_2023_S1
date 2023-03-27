package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Ville;

public interface VilleDAO extends JpaRepository<Ville, String> {
	//public ArrayList<Ville> findAllVilles();

}
