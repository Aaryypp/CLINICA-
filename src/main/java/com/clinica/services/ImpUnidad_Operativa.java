package com.clinica.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoUnidad_Operativa;
import com.clinica.entity.Unidad_Operativa;

@Service
public class ImpUnidad_Operativa implements SerUnidad_Operativa{

	@Autowired
	private DaoUnidad_Operativa dao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Unidad_Operativa> findAll() {
		return (List<Unidad_Operativa>) dao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Unidad_Operativa findById(Long id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Unidad_Operativa save(Unidad_Operativa unidad_operativa) {
		return dao.save(unidad_operativa);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.deleteById(id);
	}
}
