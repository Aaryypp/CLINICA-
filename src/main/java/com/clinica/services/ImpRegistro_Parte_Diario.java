package com.clinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoRegistro_Parte_Diario;
import com.clinica.entity.Registro_Parte_Diario;

@Service
public class ImpRegistro_Parte_Diario implements SerRegistro_Parte_Diario{

	@Autowired
	private DaoRegistro_Parte_Diario dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Registro_Parte_Diario> findAll() {
		return (List<Registro_Parte_Diario>)dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Registro_Parte_Diario findById(Long id) {
		return dao.findById(id).orElse(null);	}

	@Override
	@Transactional
	public Registro_Parte_Diario save(Registro_Parte_Diario registro_parte_diario) {
		return dao.save(registro_parte_diario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		dao.deleteById(id);
	}

}
