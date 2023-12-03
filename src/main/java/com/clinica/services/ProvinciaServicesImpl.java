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

}
