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
import com.clinica.entity.Parroquia;
import com.clinica.services.SerParroquia;

@RestController
@RequestMapping("/api")
public class CtrlParroquia {
	@Autowired
	private SerParroquia ser;
	
	/// listarparroquias
	@GetMapping("/parroquias")
	public List<Parroquia> index() {
		return ser.findAll();
	}
	// buscarparroquia
	@GetMapping("/parroquias/{id_parroquia}")
	public Parroquia show(@PathVariable Long id_parroquia) {
		return ser.findById(id_parroquia);
	}
	// insertarparroquia
	@PostMapping("/parroquias")
	@ResponseStatus(HttpStatus.CREATED)
	public Parroquia create(@RequestBody Parroquia parroquia) {
		return ser.save(parroquia);
	}

	// editarparroquia
	@PutMapping("/parroquias/{id_parroquia}")
	public Parroquia update(@RequestBody Parroquia parroquia, @PathVariable Long id_parroquia) {
		Parroquia parroquiaActual = ser.findById(id_parroquia);
		parroquiaActual.setNombre_parroquia(parroquia.getNombre_parroquia());
		parroquiaActual.setId_canton(parroquia.getId_canton());
		return ser.save(parroquiaActual);

	}
	// eliminar una parroquia
	@DeleteMapping("/parroquias/{id_parroquia}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_parroquia) {
		ser.delete(id_parroquia);
	}

}
