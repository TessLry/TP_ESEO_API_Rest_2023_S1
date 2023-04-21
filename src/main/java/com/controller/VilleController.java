package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.VilleDAO;
import com.dto.Ville;

@RestController
public class VilleController {
	
	@Autowired
	private VilleDAO villeDAO;
	
	@GetMapping("/villes")
    public List<Ville> getVilles()
    {
        return villeDAO.findAll();
    }
	
	@GetMapping("/villes/{code_commune}")
	public Optional<Ville> getVilleById(@PathVariable String code_commune)
	{
		return villeDAO.findById(code_commune);
	} 
	
	@PostMapping("/villes")
	public void addVille(@RequestBody Ville ville)
	{
		villeDAO.save(ville);
	}
	
	@DeleteMapping("/villes/{code_commune")
    public void deleteVille(@PathVariable String code_commune) {
        if(villeDAO.existsById(code_commune)) {
            villeDAO.deleteById(code_commune);
        }
    }

    @PutMapping("/villes")
    public void updateVille(@RequestBody Ville ville) {
        villeDAO.save(ville);
    }
	

}
