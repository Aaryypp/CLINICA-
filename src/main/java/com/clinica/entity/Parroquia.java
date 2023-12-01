package com.clinica.entity;


import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="parroquia", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_parroquia"})})
public class Parroquia implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_parroquia;
	private Long id_canton;
	private String nombre_parroquia;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_parroquia")
	private List<Area>areas; 
	
	public Long getId_parroquia() {
		return id_parroquia;
	}
	public void setId_parroquia(Long id_parroquia) {
		this.id_parroquia = id_parroquia;
	}
	public Long getId_canton() {
		return id_canton;
	}
	public void setId_canton(Long id_canton) {
		this.id_canton = id_canton;
	}
	public String getNombre_parroquia() {
		return nombre_parroquia;
	}
	public void setNombre_parroquia(String nombre_parroquia) {
		this.nombre_parroquia = nombre_parroquia;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	
}
