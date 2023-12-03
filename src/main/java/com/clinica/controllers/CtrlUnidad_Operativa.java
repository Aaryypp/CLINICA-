package com.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.entity.Unidad_Operativa;
import com.clinica.services.IUnidad_OperativaService;

@RestController
@RequestMapping("/api")
public class CtrlUnidad_Operativa {
	
	@Autowired
	private IUnidad_OperativaService srv;
	
	@GetMapping("/unidad_operativa")
	public List<Unidad_Operativa> listar(){
		return srv.findAll();
	}
	
	@GetMapping("/unidad_operativa/{id}")
	public Unidad_Operativa buscar(@PathVariable Long id) {
		return srv.findById(id);
	}
	
	@PutMapping("/unidad_operativa")
	@ResponseStatus(HttpStatus.CREATED)
	public Unidad_Operativa crear(@RequestBody Unidad_Operativa body) {
		return srv.save(body);
	}
	
	@PutMapping("/unidad_operativa/{id}")
	public Unidad_Operativa actualizar(@RequestBody Unidad_Operativa body,@PathVariable Long id) {
		Unidad_Operativa uop = srv.findById(id);
		uop.setId_area(body.getId_area());
		uop.setNombre_unidad_operativa(body.getNombre_unidad_operativa());
		return srv.save(uop);
	}
	
	@DeleteMapping("/unidad_operativa/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		srv.delete(id);
	}
}
