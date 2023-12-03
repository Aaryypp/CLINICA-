package com.clinica.services;

import java.util.List;
import com.clinica.entity.Historia_Clinica;

public interface IHistoria_ClinicaService {
	public List<Historia_Clinica> findAll();
	public Historia_Clinica findById(String id);
	public Historia_Clinica save(Historia_Clinica historia_clinica);
	public void delete (String id);
}
