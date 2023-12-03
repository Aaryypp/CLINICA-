package com.clinica.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="canton", uniqueConstraints = {@UniqueConstraint(columnNames= {"id_provincia"})})
public class Canton  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_canton;
	private Long nombre_canton;
	private Long id_provincia;
	
	public Long getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(Long id_provincia) {
		this.id_provincia = id_provincia;
	}
	public Long getId_canton() {
		return id_canton;
	}
	public void setId_canton(Long id_canton) {
		this.id_canton = id_canton;
	}
	public Long getNombre_canton() {
		return nombre_canton;
	}
	public void setNombre_canton(Long nombre_canton) {
		this.nombre_canton = nombre_canton;
	}
	
	

	

}
