package com.clinica.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="registro_parte_diario",uniqueConstraints = {@UniqueConstraint(columnNames = {"id_parte_diario"})})
public class Registro_Parte_Diario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_parte_diario;
	@Column(length=10, nullable = false)
	private String cedula;
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;
	@Column(nullable = false)
	private Long codigo;
	private Long numero_visita;
	private double peso_paciente;
	private double talla_paciente;
	
	@PrePersist
	public void prePersist() {
		fecha_registro = new Date();
	}

	public Long getId_parte_diario() {
		return id_parte_diario;
	}

	public void setId_parte_diario(Long id_parte_diario) {
		this.id_parte_diario = id_parte_diario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getNumero_visita() {
		return numero_visita;
	}

	public void setNumero_visita(Long numero_visita) {
		this.numero_visita = numero_visita;
	}

	public double getPeso_paciente() {
		return peso_paciente;
	}

	public void setPeso_paciente(double peso_paciente) {
		this.peso_paciente = peso_paciente;
	}

	public double getTalla_paciente() {
		return talla_paciente;
	}

	public void setTalla_paciente(double talla_paciente) {
		this.talla_paciente = talla_paciente;
	}

}
