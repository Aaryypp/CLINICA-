package com.clinica.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.clinica.entity.Provincia;
import com.clinica.services.IProvinciaServices;

@RestController
@RequestMapping("/api")
public class ProvinciaRestController {
	
	@Autowired
	private IProvinciaServices provinciaServices;
	
	@GetMapping("/provincias")
	public List<Provincia>index() {
		return provinciaServices.findAll();
	}

}
