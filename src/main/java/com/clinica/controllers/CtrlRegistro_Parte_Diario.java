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

import com.clinica.entity.Registro_Parte_Diario;
import com.clinica.services.IRegistro_Parte_DiarioService;

@RestController
@RequestMapping("/api")
public class CtrlRegistro_Parte_Diario {

	@Autowired
	private IRegistro_Parte_DiarioService srv;
	
	@GetMapping("/registro_parte_diario")
	public List<Registro_Parte_Diario> listar(){
		return srv.findAll();
	}
	
	@GetMapping("/registro_parte_diario/{id}")
	public Registro_Parte_Diario buscar(@PathVariable Long id) {
		return srv.findById(id);
	}
	
	@PutMapping("/registro_parte_diario")
	@ResponseStatus(HttpStatus.CREATED)
	public Registro_Parte_Diario crear(@RequestBody Registro_Parte_Diario body) {
		return srv.save(body);
	}
	
	@PutMapping("registro_parte_diario/{id}")
	public Registro_Parte_Diario actualizar(@RequestBody Registro_Parte_Diario body, @PathVariable Long id) {
		Registro_Parte_Diario rpd = srv.findById(id);
		rpd.setCedula(body.getCedula());
		rpd.setCodigo(body.getCodigo());
		rpd.setNumero_visita(body.getNumero_visita());
		rpd.setTalla_paciente(body.getTalla_paciente());
		rpd.setPeso_paciente(body.getPeso_paciente());
		return srv.save(rpd);
	}
	
	@DeleteMapping("registro_parte_diario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar (@PathVariable Long id) {
		srv.delete(id);
	}
}
