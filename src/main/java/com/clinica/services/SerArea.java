package com.clinica.services;

import java.util.List;
import com.clinica.entity.Area;

public interface SerArea  {
	public List<Area>findAll();
	public Area save(Area area);
	public Area findById(Long id_area);
	public void delete(Long id_area);

}
