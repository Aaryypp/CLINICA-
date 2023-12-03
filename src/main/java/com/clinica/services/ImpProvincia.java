package com.clinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoProvincia;
import com.clinica.entity.Provincia;


@Service
public class ImpProvincia implements SerProvincia{
	
	   
	@Autowired
    private DaoProvincia dao;
    
	
	@Override
	@Transactional(readOnly=true)
	public List<Provincia> findAll() {
		return (List<Provincia>) dao.findAll();
	}
	@Override
	@Transactional
	public Provincia save(Provincia provincia) {
		return dao.save(provincia);
	}
	@Override
	@Transactional(readOnly=true)
	public Provincia findById(Long id_povincia) {
		return dao.findById(id_povincia).orElse(null);
	}
	@Override
	@Transactional
	public void delete(Long id_povincia) {
		dao.deleteById(id_povincia);
	}

}
