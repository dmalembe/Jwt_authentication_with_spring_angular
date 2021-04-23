package com.entreprise.authenticationservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole nom;
	
	//Constructors
	public Role() {
		
	}
	public Role(ERole nom) {
		this.nom = nom;
	}

	//Accesseurs & Mutateurs

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ERole getNom() {
		return nom;
	}

	public void setNom(ERole nom) {
		this.nom = nom;
	}
	
	
}
