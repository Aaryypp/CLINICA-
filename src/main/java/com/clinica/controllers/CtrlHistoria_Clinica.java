package com.clinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.entity.Historia_Clinica;
import com.clinica.services.SerHistoria_Clinica;

@RestController
@RequestMapping("/api")
public class CtrlHistoria_Clinica {
	
	@Autowired
	private SerHistoria_Clinica ser;
	
	@GetMapping("/historia_clinica")
	public List<Historia_Clinica> listar(){
		return ser.findAll();
	}
	
	@GetMapping("/historia_clinica/{cedula}")
	public Historia_Clinica buscar (@PathVariable String cedula) {
		return ser.findById(cedula);
	}
	
	@PostMapping("/historia_clinica")
	@ResponseStatus(HttpStatus.CREATED)
	public Historia_Clinica crear(@RequestBody Historia_Clinica body){
		return ser.save(body);
	}
	
	@PutMapping("/historia_clinica/{cedula}")
	public Historia_Clinica actualizar(@RequestBody Historia_Clinica body, @PathVariable String cedula) {
		Historia_Clinica hc = ser.findById(cedula);
		hc.setApellido_paciente(body.getApellido_paciente());
		hc.setNombre_paciente(body.getNombre_paciente());
		hc.setFecha_nacimiento(body.getFecha_nacimiento());
		return ser.save(hc);
	}
	
	@DeleteMapping("historia_clinica/{cedula}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable String cedula) {
		ser.delete(cedula);
	}
}
