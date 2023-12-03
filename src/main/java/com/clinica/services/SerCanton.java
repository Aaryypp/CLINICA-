package com.clinica.services;

import java.util.List;

import com.clinica.entity.Canton;

public interface SerCanton {
	public List<Canton>findAll();
	public Canton save(Canton canton);
	public Canton findById(Long id_canton);
	public void delete(Long id_canton);

}
