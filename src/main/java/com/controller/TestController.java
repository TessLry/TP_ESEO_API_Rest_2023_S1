//package com.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.dao.VilleDAO;
//import com.dto.Ville;
//
//@RestController
//public class TestController {
//	
//	@Autowired
//	private VilleDAO villeDAO;
//	
//	@GetMapping("/villes")
//    public List<Ville> getVilles()
//    {
//        return villeDAO.findAll();
//    }
//
//}
