package com.clinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoParroquia;
import com.clinica.entity.Parroquia;

@Service
public class ImpParroquia implements SerParroquia {
	
	@Autowired
    private DaoParroquia dao;

	@Override
	@Transactional(readOnly=true)
	public List<Parroquia> findAll() {
		// TODO Auto-generated method stub
		return (List<Parroquia>) dao.findAll();
	}

	@Override
	@Transactional
	public Parroquia save(Parroquia parroquia) {
		// TODO Auto-generated method stub
		return dao.save(parroquia);
	}

	@Override
	@Transactional(readOnly=true)
	public Parroquia findById(Long id_parroquia) {
		// TODO Auto-generated method stub
		return dao.findById(id_parroquia).orElse(null);
	}

	@Override
	public void delete(Long id_parroquia) {
		dao.deleteById(id_parroquia);
	}
	

}
