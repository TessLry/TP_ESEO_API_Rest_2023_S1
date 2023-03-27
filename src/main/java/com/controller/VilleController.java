package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
//	@RequestMapping(value="/ville", method=RequestMethod.GET)
//	@ResponseBody
//	public ArrayList<Ville> get(@RequestParam(required=false, value="codePostal") String codePostal) {
//		ArrayList<Ville> listVille = this.villeBLOService.getInfoVilles(codePostal);
//		return listVille;
//	}
	
	

}
