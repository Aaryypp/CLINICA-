package com.clinica.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clinica.entity.Provincia;
import com.clinica.services.IProvinciaServices;
import com.practica_spring.entity.Cliente;

@RestController
@RequestMapping("/api")
public class ProvinciaRestController {
	
	@Autowired
	private IProvinciaServices provinciaService;
	
	@GetMapping("/provincias")
	public List<Provincia>index() {
		return provinciaService.findAll();
	}

	//buscar una provincia por id
	@GetMapping("/provincias/{id}")
	public Provincia show (@PathVariable Long id){
		return provinciaService.findById(id);
	}
	
}
