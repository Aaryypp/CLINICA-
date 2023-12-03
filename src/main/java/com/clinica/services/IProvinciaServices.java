package com.clinica.services;
import java.util.List;

import com.clinica.entity.Provincia;

public interface IProvinciaServices {
	
	public List<Provincia> findAll();
	public Provincia findById(Long id);
}
