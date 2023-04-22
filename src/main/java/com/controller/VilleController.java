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
	
	@GetMapping("/villes/{codeCommune}")
	public Optional<Ville> getVilleById(@PathVariable String codeCommune)
	{
		return villeDAO.findById(codeCommune);
	} 
	
	@PostMapping("/villes")
	public void addVille(@RequestBody Ville ville)
	{
		villeDAO.save(ville);
	}
	
	@DeleteMapping("/villes/{codeCommune")
    public void deleteVille(@PathVariable String codeCommune) {
        if(villeDAO.existsById(codeCommune)) {
            villeDAO.deleteById(codeCommune);
        }
    }

    @PutMapping("/villes")
    public void updateVille(@RequestBody Ville ville) {
        villeDAO.save(ville);
    }
	

}
