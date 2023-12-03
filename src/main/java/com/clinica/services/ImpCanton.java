package com.clinica.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clinica.dao.DaoCanton;
import com.clinica.entity.Canton;

@Service
public class ImpCanton  implements SerCanton{
	@Autowired
	
	private DaoCanton dao;

	@Override
	@Transactional(readOnly=true)
	public List<Canton> findAll() {
		// TODO Auto-generated method stub
		return (List<Canton>) dao.findAll();
	}

	@Override
	@Transactional
	public Canton save(Canton canton) {
		// TODO Auto-generated method stub
		return dao.save(canton);
	}

	@Override
	@Transactional(readOnly=true)
	public Canton findById(Long id_canton) {
		// TODO Auto-generated method stub
		return dao.findById(id_canton).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_canton) {
		dao.deleteById(id_canton);
	}

	

	

	
	
	

}
