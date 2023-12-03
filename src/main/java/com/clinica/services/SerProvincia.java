package com.clinica.services;

import java.util.List;

import com.clinica.entity.Provincia;

public interface SerProvincia {
	
	public List<Provincia> findAll();
	public Provincia save(Provincia provincia);
	public Provincia findById(Long id);
	public void delete(Long id);
	
}
