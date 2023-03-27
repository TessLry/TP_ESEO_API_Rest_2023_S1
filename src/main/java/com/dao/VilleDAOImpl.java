//package com.dao;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import org.springframework.stereotype.Repository;
//
//import com.dto.Ville;
//
//@Repository
//public class VilleDAOImpl implements VilleDAO 
//{
//	
//	public ArrayList<Ville> findAllVilles() {
//		System.out.println("findAllVilles");
//	
//		ArrayList<Ville> listVille = new ArrayList<Ville>();
//		
//		try
//	    {
//	      Class.forName("com.mysql.jdbc.Driver");
//	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/twic", "root", "");
//	      Statement stmt = conn.createStatement();
//	      ResultSet res = stmt.executeQuery("SELECT * FROM ville_france");
//	      while(res.next())
//	      {
//	    	 Ville ville = new Ville();
//	    	 ville.setCodePostal(res.getString("Code_postal"));
//	    	 ville.setNomCommune(res.getString("Nom_commune"));
//	    	 listVille.add(ville);
//	      }
//	      conn.close();
//	    }
//	    catch(Exception e){ 
//	      System.out.println(e);
//	    }
//		
//		return listVille;
//	}
//
//}
