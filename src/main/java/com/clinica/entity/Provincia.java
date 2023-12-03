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


@Entity
@Table(name="provincia")
public class Provincia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_provincia;
    private String nombre_provincia;
    
    
    
    @OneToMany(fetch =FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="id_provincia")
    private List<Canton> cantones;


	public Long getId_provincia() {
		return id_provincia;
	}


	public void setId_provincia(Long id_provincia) {
		this.id_provincia = id_provincia;
	}


	public String getNombre_provincia() {
		return nombre_provincia;
	}


	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}


	public List<Canton> getCantones() {
		return cantones;
	}


	public void setCantones(List<Canton> cantones) {
		this.cantones = cantones;
	}
    
    
    
    
	
    
    
    
    
	
    
    
    
    
    
    
   
    
	

}
