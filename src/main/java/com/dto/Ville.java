package com.dto;

import lombok.Data;

@Data
public class Ville {
	
	private String code_commune;
	private String nomCommune;
	private String codePostal;
	private String libelle_acheminement;
	private String ligne;
	private String latitude;
	private String longitude;
	
	
	
	public String getCode_commune() {
		return code_commune;
	}
	public void setCode_commune(String code_commune) {
		this.code_commune = code_commune;
	}
	public String getLibelle_acheminement() {
		return libelle_acheminement;
	}
	public void setLibelle_acheminement(String libelle_acheminement) {
		this.libelle_acheminement = libelle_acheminement;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getLigne() {
		return ligne;
	}
	public void setLigne(String ligne) {
		this.ligne = ligne;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	
	

}
