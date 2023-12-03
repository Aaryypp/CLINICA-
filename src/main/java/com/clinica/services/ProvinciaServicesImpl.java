package com.clinica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.IProvinciaDAO;
import com.clinica.entity.Provincia;


@Service
public class ProvinciaServicesImpl implements IProvinciaServices{
	
	   
	@Autowired
    private IProvinciaDAO ProvinciaDAO;
    
	
	@Override
	@Transactional(readOnly=true)
	public List<Provincia> findAll() {
		return (List<Provincia>) ProvinciaDAO.findAll();
	}
	@Override
	@Transactional
	public Provincia save(Provincia provincia) {
		return ProvinciaDAO.save(provincia);
	}
	@Override
	@Transactional(readOnly=true)
	public Provincia findById(Long id_povincia) {
		return ProvinciaDAO.findById(id_povincia).orElse(null);
	}
	@Override
	@Transactional
	public void delete(Long id_povincia) {
		ProvinciaDAO.deleteById(id_povincia);
		
	}

}
