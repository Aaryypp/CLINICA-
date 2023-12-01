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
@Table(name="unidad_operativa", uniqueConstraints = {@UniqueConstraint(columnNames = {"codigo"})})
public class Unidad_Operativa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private Long id_area;
	private String nombre_unidad_operativa;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="codigo")
	private List<Registro_Parte_Diario> registros_parte_diario;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getId_area() {
		return id_area;
	}

	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}

	public String getNombre_unidad_operativa() {
		return nombre_unidad_operativa;
	}

	public void setNombre_unidad_operativa(String nombre_unidad_operativa) {
		this.nombre_unidad_operativa = nombre_unidad_operativa;
	}

	public List<Registro_Parte_Diario> getRegistros_parte_diario() {
		return registros_parte_diario;
	}

	public void setRegistros_parte_diario(List<Registro_Parte_Diario> registros_parte_diario) {
		this.registros_parte_diario = registros_parte_diario;
	}
}
