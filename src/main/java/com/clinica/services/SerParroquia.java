package com.clinica.services;

import java.util.List;
import com.clinica.entity.Parroquia;

public interface SerParroquia {
	
	public List<Parroquia>findAll();
	public Parroquia save(Parroquia parroquia);
	public Parroquia findById(Long id_parroquia);
	public void delete(Long id_parroquia);

}
