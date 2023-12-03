package com.clinica.services;

import java.util.List;

import com.clinica.entity.Unidad_Operativa;

public interface IUnidad_OperativaService {
	public List<Unidad_Operativa> findAll();
	public Unidad_Operativa findById (Long id);
	public Unidad_Operativa save (Unidad_Operativa unidad_operativa);
	public void delete (Long id);
}
