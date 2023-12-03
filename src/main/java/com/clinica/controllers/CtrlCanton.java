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
import com.clinica.entity.Canton;
import com.clinica.services.SerCanton;

@RestController
@RequestMapping("/api")
public class CtrlCanton {
	@Autowired
	private SerCanton ser;

	/// listarcantones
	@GetMapping("/cantones")
	public List<Canton> index() {
		return ser.findAll();
	}

	// buscarporid
	@GetMapping("/cantones/{id_cantones}")
	public Canton show(@PathVariable Long id_cantones) {
		return ser.findById(id_cantones);
	}

	// insertarcanton
	@PostMapping("/cantones")
	@ResponseStatus(HttpStatus.CREATED)
	public Canton create(@RequestBody Canton canton) {
		return ser.save(canton);
	}

	// editar un canton
	@PutMapping("/cantones/{id_canton}")
	public Canton update(@RequestBody Canton canton, @PathVariable Long id_canton) {
		Canton cantonActual = ser.findById(id_canton);
		cantonActual.setNombre_canton(canton.getNombre_canton());
		return ser.save(cantonActual);

	}

	// eliminar una canton
	@DeleteMapping("/canton/{id_canton}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_canton) {
		ser.delete(id_canton);
	}

}
