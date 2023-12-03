package com.clinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoArea;
import com.clinica.entity.Area;

@Service
public class ImpArea implements SerArea{
	
	@Autowired
	private DaoArea dao;

	@Override
	@Transactional(readOnly=true)
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		return (List<Area>) dao.findAll();
	}

	@Override
	@Transactional
	public Area save(Area area) {
		// TODO Auto-generated method stub
		return dao.save(area);
	}

	@Override
	@Transactional(readOnly=true)
	public Area findById(Long id_area) {
		// TODO Auto-generated method stub
		return dao.findById(id_area).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_area) {
		dao.deleteById(id_area);
		
	}


}
