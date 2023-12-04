package com.clinica.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name="area", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_area"})})
public class Area implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_area;
	@Column(nullable = false)
	private Long id_parroquia;
	private String nombre_area;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_area")
	private List<Unidad_Operativa> unidades_operativas;
	
	public Long getId_area() {
		return id_area;
	}
	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}
	public Long getId_parroquia() {
		return id_parroquia;
	}
	public void setId_parroquia(Long id_parroquia) {
		this.id_parroquia = id_parroquia;
	}
	public String getNombre_area() {
		return nombre_area;
	}
	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}
	public List<Unidad_Operativa> getUnidades_operativas() {
		return unidades_operativas;
	}
	public void setUnidades_operativas(List<Unidad_Operativa> unidades_operativas) {
		this.unidades_operativas = unidades_operativas;
	}
	
}
