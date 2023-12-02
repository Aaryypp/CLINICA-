package com.clinica.services;
import java.util.List;

import com.clinica.entity.Provincia;

public interface IProvinciaServices {
	
	public List<Provincia> findAll();
	public Provincia save(Provincia provincia);
	public Provincia findById(Long id_provincia);
	public void delete (Long id_provincia);
	
	
}
