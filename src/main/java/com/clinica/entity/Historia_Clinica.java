package com.clinica.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="historia_clinica",uniqueConstraints = {@UniqueConstraint(columnNames = {"cedula"})})
public class Historia_Clinica implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length=10)
	private String cedula;
	private String nombre_paciente;
	private String apellido_paciente;
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="cedula")
	private List<Registro_Parte_Diario> registros_parte_diario;
	
	/*
	 * @PrePersist
	public void prePersist() {
		fecha_nacimiento = new Date();
	}
	 */

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre_paciente() {
		return nombre_paciente;
	}

	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
	}

	public String getApellido_paciente() {
		return apellido_paciente;
	}

	public void setApellido_paciente(String apellido_paciente) {
		this.apellido_paciente = apellido_paciente;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public List<Registro_Parte_Diario> getRegistros_parte_diario() {
		return registros_parte_diario;
	}

	public void setRegistros_parte_diario(List<Registro_Parte_Diario> registros_parte_diario) {
		this.registros_parte_diario = registros_parte_diario;
	}
	
}
