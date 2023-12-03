package com.clinica.services;

import java.util.List;

import com.clinica.entity.Registro_Parte_Diario;

public interface SerRegistro_Parte_Diario {
	public List<Registro_Parte_Diario> findAll();
	public Registro_Parte_Diario findById(Long id);
	public Registro_Parte_Diario save (Registro_Parte_Diario registro_parte_diario);
	public void delete(Long id);
	;
}
