package com.clinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoHistoria_Clinica;
import com.clinica.entity.Historia_Clinica;


@Service
public class ImpHistoria_Clinica implements SerHistoria_Clinica  {
	
	@Autowired
	private DaoHistoria_Clinica dao;

	@Override
	@Transactional(readOnly = true)
	public List<Historia_Clinica> findAll() {
		return (List<Historia_Clinica>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Historia_Clinica findById(String cedula) {
		return dao.findById(cedula).orElse(null);
	}

	@Override
	@Transactional
	public Historia_Clinica save(Historia_Clinica historia_clinica) {
		return dao.save(historia_clinica);
	}

	@Override
	@Transactional
	public void delete(String cedula) {
		dao.deleteById(cedula);
	}
}
